java.util.Calendar getLastRefreshedTime() {
    if ((this.m_lastRefreshedTime) == null) {
        this.m_lastRefreshedTime = java.util.Calendar.getInstance();
        return this.m_lastRefreshedTime;
    }
    return this.m_lastRefreshedTime;
}