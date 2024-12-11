import { useState, useEffect } from 'react'
import axios from 'axios'

const TicketDisplay = () => {
    const [tickets, setTickets] = useState([])

    useEffect(() => {
        const fetchTickets = async () => {
            try {
                const response = await axios.get('/api/tickets')
                setTickets(response.data)
            } catch (error) {
                console.error('Failed to fetch tickets', error)
            }
        }
        fetchTickets()
    }, [])

    return (
        <div>
            <h2>Available Tickets</h2>
            <ul>
                {tickets.map(ticket => (
                    <li key={ticket.ticketID}>{ticket.event} - {ticket.ticketPrice} USD</li>
                ))}
            </ul>
        </div>
    )
}

export default TicketDisplay