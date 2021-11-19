@java.lang.Override
public void connected(org.jivesoftware.smack.XMPPConnection connection) {
    mBus.post(new com.pz.supportchat.PostingConnectionChangeListener.XMPPConnectionStatus(com.pz.supportchat.PostingConnectionChangeListener.CONNECTED));
}