@java.lang.Override
protected void onCommunicationEnabled() {
    super.onCommunicationEnabled();
    sendMessage(new com.fbessou.sofa.message.GameJoinMessage());
    if ((mConnectionListener) == null)
        mConnectionListener.onConnected();
    
}