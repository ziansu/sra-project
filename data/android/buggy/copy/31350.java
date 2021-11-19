public synchronized uk.ac.horizon.ubihelper.net.Message getMessage() {
    uk.ac.horizon.ubihelper.net.Message m = recvMessageQueue.poll();
    return m;
}