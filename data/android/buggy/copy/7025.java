@java.lang.Override
protected double calculateThroughput(long time) {
    return (1000 * (m_processed.get())) / time;
}