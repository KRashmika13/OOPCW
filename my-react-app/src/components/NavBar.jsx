import { Link } from 'react-router-dom'

const Navbar = () => {
    return (
        <nav>
            <ul>
                <li><Link to="/">Home</Link></li>
                <li><Link to="/configuration">Configuration</Link></li>
                <li><Link to="/control">Control</Link></li>
                <li><Link to="/logs">Logs</Link></li>
                <li><Link to="/login">Login</Link></li>
                <li><Link to="/signup">Sign Up</Link></li>
            </ul>
        </nav>
    )
}

export default Navbar