import { useState, useEffect } from 'react'

const LogDisplay = () => {
    const [logs, setLogs] = useState([])

    useEffect(() => {
        const fetchLogs = () => {
            // Simulate fetching logs
            setLogs([
                'Ticket added: T001',
                'Customer booked a ticket: T002',
            ])
        }

        fetchLogs()
    }, [])

    return (
        <div>
            <h2>Logs</h2>
            <ul>
                {logs.map((log, index) => (
                    <li key={index}>{log}</li>
                ))}
            </ul>
        </div>
    )
}

export default LogDisplay
