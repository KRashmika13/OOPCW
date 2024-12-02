package com.ticketManager.OOPCW;

public class Ticket {
    //instance variables
    private int ticketID;
    private double ticketPrice;


    //constructor
    public Ticket(int ticketID, double ticketPrice) {
        this.ticketID = ticketID;
        this.ticketPrice = ticketPrice;

    }

    //getters and setters
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
