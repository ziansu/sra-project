@java.lang.Override
protected boolean updateCurrentBar(long time, double price) {
    if ((m_tick) != null) {
        return m_tick.update(price);
    }
    return false;
}