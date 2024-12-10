package com.ticketManager.OOPCW.thread;

import com.ticketManager.OOPCW.model.Ticket;

public class CustomerThread implements Runnable {
    private final TicketPool ticketPool;
    private final String customerName;

    public CustomerThread(TicketPool ticketPool, String customerName) {
        this.ticketPool = ticketPool;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        try {
            Ticket ticket = ticketPool.getTicket();
            System.out.println(customerName + " successfully booked Ticket ID: " + ticket.getTicketID());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(customerName + " was interrupted while waiting for a ticket.");
        }
    }
}
