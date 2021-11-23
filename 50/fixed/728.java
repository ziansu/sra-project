private void reset() {
    clientConnected = true;
    clientKey = null;
    nextSeqNum = -1;
    allChunks = null;
    fileName = "";
    fileInChunks = 0;
}