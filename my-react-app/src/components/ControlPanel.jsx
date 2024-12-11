import { useState } from 'react'

const ControlPanel = () => {
    const [isRunning, setIsRunning] = useState(false)

    const toggleControl = () => {
        setIsRunning(!isRunning)
    }

    return (
        <div>
            <button onClick={toggleControl}>{isRunning ? 'Stop' : 'Start'}</button>
            <p>{isRunning ? 'System is running' : 'System is stopped'}</p>
        </div>
    )
}

export default ControlPanel