package com.ticketManager.OOPCW;

import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

public class TicketPool {
    //instance variables
    private List<Ticket> tickets;
    private int maxCapacity;

    //constructor
    public TicketPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.tickets = Collections.synchronizedList(new LinkedList<>());
    }
}
