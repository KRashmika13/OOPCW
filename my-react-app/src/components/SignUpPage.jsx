import { useState } from 'react'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'

const SignUpPage = () => {
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const navigate = useNavigate()

    const handleSignUp = async (e) => {
        e.preventDefault()
        try {
            const response = await axios.post('/api/customers', { name, email, password })
            if (response.status === 201) {
                navigate('/login')
            }
        } catch (error) {
            console.error('Sign-up failed', error)
        }
    }

    return (
        <form onSubmit={handleSignUp}>
            <input
                type="text"
                placeholder="Name"
                value={name}
                onChange={(e) => setName(e.target.value)}
                required
            />
            <input
                type="email"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                required
            />
            <input
                type="password"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
            />
            <button type="submit">Sign Up</button>
        </form>
    )
}

export default SignUpPage