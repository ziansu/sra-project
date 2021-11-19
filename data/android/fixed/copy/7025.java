@java.lang.Override
protected double calculateThroughput(long time) {
    return time == 0 ? 0 : (1000 * (m_processed.get())) / time;
}