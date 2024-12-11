import { useState } from 'react'

const ConfigurationForm = () => {
    const [configuration, setConfiguration] = useState({})

    const handleInputChange = (e) => {
        const { name, value } = e.target
        setConfiguration({
            ...configuration,
            [name]: value
        })
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        // Send configuration data to backend
        console.log(configuration)
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Ticket Price:
                <input
                    type="number"
                    name="ticketPrice"
                    value={configuration.ticketPrice || ''}
                    onChange={handleInputChange}
                />
            </label>
            <label>
                Event:
                <input
                    type="text"
                    name="event"
                    value={configuration.event || ''}
                    onChange={handleInputChange}
                />
            </label>
            <button type="submit">Save Configuration</button>
        </form>
    )
}

export default ConfigurationForm