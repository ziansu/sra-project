public uk.ac.horizon.ubihelper.net.Message getMessage() {
    synchronized(recvMessageQueue) {
        uk.ac.horizon.ubihelper.net.Message m = recvMessageQueue.poll();
        return m;
    }
}