public void startCommunicating() {
    discoveredBean.connect(context, getBeanConnectionListener());
    sendDelayedRemoteStateQuery();
}