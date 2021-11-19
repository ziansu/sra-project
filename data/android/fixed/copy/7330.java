private void update(long dt) {
    synchronized(m_particleSystem) {
        m_particleSystem.tick();
    }
}