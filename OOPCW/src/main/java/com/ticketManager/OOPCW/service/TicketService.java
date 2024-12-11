package com.ticketManager.OOPCW.service;

import com.ticketManager.OOPCW.dto.TicketDTO;
import com.ticketManager.OOPCW.model.Ticket;

import java.util.List;

public interface TicketService {
    Ticket saveTicket(TicketDTO ticketDTO);
    List<Ticket> getTicketsByEvent(String event);
    Ticket getTicketByTicketID(Long ticketID);
}
