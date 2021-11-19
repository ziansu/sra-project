public boolean disconnect() {
    if (m_connected) {
        try {
            m_connection.close();
            m_connection.writeLine("BYE");
        } catch (java.io.IOException e) {
        }
        m_connected = m_loggedIn = false;
    }
    return !(m_connected);
}