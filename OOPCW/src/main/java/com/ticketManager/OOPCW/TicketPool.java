package com.ticketManager.OOPCW;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class TicketPool {
    //instance variables
    private List<Ticket> tickets;
    private int maxCapacity;

    //constructor
    public TicketPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.tickets = Collections.synchronizedList(new LinkedList<>());
    }

    public synchronized void addTicket(Ticket ticket) {
        while (tickets.size() >= maxCapacity) {
            try{
                System.out.println("Waiting for space");
                wait(); //wait until there is space in the pool
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
