package com.ticketManager.OOPCW.thread;

import com.ticketManager.OOPCW.model.Ticket;

public class VendorThread implements Runnable {
    private final TicketPool ticketPool;
    private final String vendorName;
    private final Ticket ticket;

    public VendorThread(TicketPool ticketPool, String vendorName, Ticket ticket) {
        this.ticketPool = ticketPool;
        this.vendorName = vendorName;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticketPool.addTicket(ticket);
        System.out.println(vendorName + " added Ticket ID: " + ticket.getTicketID());
    }
}
