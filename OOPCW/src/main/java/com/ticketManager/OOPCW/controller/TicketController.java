package com.ticketManager.OOPCW.controller;

import com.ticketManager.OOPCW.dto.TicketDTO;
import com.ticketManager.OOPCW.model.Ticket;
import com.ticketManager.OOPCW.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket createTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.saveTicket(ticketDTO);
    }

    @GetMapping("/event/{event}")
    public List<Ticket> getTicketsByEvent(@PathVariable String event) {
        return ticketService.getTicketsByEvent(event);
    }

    @GetMapping("/ticketID/{ticketID}")
    public Ticket getTicketById(@PathVariable String ticketID) {
        return ticketService.getTicketByTicketID(ticketID);
    }
}
