public synchronized void writeDeleteLogs(int startIndex, int endIndex) {
    logFile.printf("DELETE IndexFrom: %d, IndexUntil: %d, Leader: %d\n", startIndex, endIndex, leaderID);
    logFile.flush();
    return ;
}