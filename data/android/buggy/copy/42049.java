void flushToDB() {
    if ((m_buffer.size()) >= 0) {
        m_cl.bulkInsert(m_buffer, 0);
        m_buffer.clear();
    }
}