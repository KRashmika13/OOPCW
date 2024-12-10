package com.ticketManager.OOPCW.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class TicketDTO {

    @NotBlank(message = "Ticket ID can't be blank")
    private String ticketID;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be a positive value")
    private double price;

    @NotBlank(message = "Event name can't be blank")
    private String event;

    public TicketDTO() {
    }

    public TicketDTO(String ticketID, double price, String event) {
        this.ticketID = ticketID;
        this.price = price;
        this.event = event;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "ticketID='" + ticketID + '\'' +
                ", price=" + price +
                ", event='" + event + '\'' +
                '}';
    }
}