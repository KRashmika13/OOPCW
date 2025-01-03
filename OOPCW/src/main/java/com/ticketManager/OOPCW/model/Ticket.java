package com.ticketManager.OOPCW.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

    //instance variables
    @Id
    @GeneratedValue
    private Long ticketID;
    private double ticketPrice;
    private String event;

    //constructor
    public Ticket(Long ticketID, double ticketPrice, String event) {
        this.ticketID = ticketID;
        this.ticketPrice = ticketPrice;
        this.event = event;
    }

    public Ticket() {}

    //getters and setters
    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
