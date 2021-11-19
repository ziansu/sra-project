public synchronized void close(boolean isBroadcast) throws java.lang.Exception {
    if (isBroadcast) {
        broadcastOpened = false;
    }else {
        channel.removeReceiver(receiver);
        clientOpened = false;
    }
    internalCloseChannel(channel);
}