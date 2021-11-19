public synchronized void handleNack(int numAcks) {
    nackCountInterval += numAcks;
    report(false);
}