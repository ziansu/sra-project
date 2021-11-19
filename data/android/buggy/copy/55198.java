public void shutdown() {
    synchronized(this) {
        m_active = false;
    }
}