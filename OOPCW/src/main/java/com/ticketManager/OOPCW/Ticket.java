package com.ticketManager.OOPCW;

public class Ticket {
    //instance variables
    private String ticketID;
    private double ticketPrice;


    //constructor
    public Ticket(String ticketID, double ticketPrice) {
        this.ticketID = ticketID;
        this.ticketPrice = ticketPrice;

    }

    //getters and setters
    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
