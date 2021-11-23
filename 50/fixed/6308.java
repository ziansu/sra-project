private void NOTINTERESTEDReceived() throws java.lang.Exception {
    btLogger.writeToLog(btLogger.receivedNotInterested(targetPeerID));
    if (receivedInterested) {
        threadManager.updateInterested(this, false);
    }
    receivedInterested = false;
}