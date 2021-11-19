public void addTransportTopicListener(com.wombat.mama.MamaTransportTopicListener transportTopicListener) {
    if (null == (mTopicListener)) {
        mTopicListener = new com.wombat.mama.MamaTransport.InternalTopicListener();
        nativeAddTopicListener(mTopicListener, null);
    }
    mTopicListener.setClientTopicListener(transportTopicListener);
}