package com.ticketManager.OOPCW.service.impl;

import com.ticketManager.OOPCW.dto.TicketDTO;
import com.ticketManager.OOPCW.model.Ticket;
import com.ticketManager.OOPCW.repository.TicketRepository;
import com.ticketManager.OOPCW.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket saveTicket(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        ticket.setTicketID(ticketDTO.getTicketID());
        ticket.setTicketPrice(ticketDTO.getPrice());
        ticket.setEvent(ticketDTO.getEvent());
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getTicketsByEvent(String event) {
        return ticketRepository.findByEvent(event);
    }

    @Override
    public Ticket getTicketByTicketID(Long ticketID) {
        return ticketRepository.findByTicketID(ticketID);
    }
}
