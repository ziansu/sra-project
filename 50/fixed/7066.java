public long getLastTotalTimedExecutionTimeAndReset() {
    long retval = m_workerTask.m_lastTotalTimedExecutionTime;
    m_workerTask.m_lastTotalTimedExecutionTime = m_workerTask.m_totalTimedExecutionTime;
    if ((m_coordinatorTask) != null) {
        m_coordinatorTask.m_lastTotalTimedExecutionTime = m_coordinatorTask.m_totalTimedExecutionTime;
    }
    return retval;
}