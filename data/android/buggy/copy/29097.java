@java.lang.Override
protected void onCommunicationDisabled() {
    super.onCommunicationDisabled();
    if ((mConnectionListener) == null)
        mConnectionListener.onDisconnected();
    
}