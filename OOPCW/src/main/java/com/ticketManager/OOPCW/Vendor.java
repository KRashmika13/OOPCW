package com.ticketManager.OOPCW;

public class Vendor implements Runnable{
    //instance variables
    private TicketPool ticketPool;
    private int ticketReleaseRate;

    //constructor
    public Vendor(TicketPool ticketPool, int ticketReleaseRate){
        this.ticketPool = ticketPool;
        this.ticketReleaseRate = ticketReleaseRate;
    }
    @Override
    public void run() {

    }
}
