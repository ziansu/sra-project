@java.lang.Override
protected org.jivesoftware.smack.XMPPConnection createInstance() throws java.lang.Exception {
    return org.mockito.Mockito.mock(org.jivesoftware.smack.tcp.XMPPTCPConnection.class);
}