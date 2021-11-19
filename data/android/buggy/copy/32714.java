private void failOver() {
    log("Sender-handling thread needs to fail over.");
    failoverInfo.setNeedFailover(true);
    failoverInfo.incrementUdpPort();
    while (failoverInfo.isFailed());
}