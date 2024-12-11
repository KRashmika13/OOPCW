package com.ticketManager.OOPCW.repository;

import com.ticketManager.OOPCW.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // custom query to find ticket by event
    List<Ticket> findByEvent(String event);

    //custom query to find ticket by id
    Ticket findByTicketID(Long ticketID);
}
