@java.lang.Override
protected org.jivesoftware.smack.XMPPConnection createInstance() throws java.lang.Exception {
    this.connection = org.mockito.Mockito.mock(org.jivesoftware.smack.tcp.XMPPTCPConnection.class);
    return this.connection;
}