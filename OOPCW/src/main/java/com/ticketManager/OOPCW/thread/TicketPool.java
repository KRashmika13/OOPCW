package com.ticketManager.OOPCW.thread;

import com.ticketManager.OOPCW.model.Ticket;

import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {
    private final Queue<Ticket> tickets = new LinkedList<>();

    public synchronized void addTicket(Ticket ticket) {
        tickets.offer(ticket);
        System.out.println("Ticket Added: " + ticket.getTicketID());
        notifyAll(); // Notify waiting threads when a ticket is added
    }

    public synchronized Ticket getTicket() throws InterruptedException {
        while (tickets.isEmpty()) {
            wait(); // Wait until a ticket is available
        }
        Ticket ticket = tickets.poll();
        System.out.println("Ticket Retrieved: " + ticket.getTicketID());
        return ticket;
    }

    public synchronized int getPoolSize() {
        return tickets.size();
    }
}
