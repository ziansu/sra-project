public void suspend() {
    if ((m_db) != null) {
        m_db.close();
        m_db = null;
    }
}