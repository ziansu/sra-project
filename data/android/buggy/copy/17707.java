@java.lang.Override
public void cleanUpBeforeCancel() {
    try {
        gov.nist.javax.sip.stack.TCPMessageChannel.logger.logDebug("closing socket");
        mySock.close();
    } catch (java.io.IOException ex) {
    }
}