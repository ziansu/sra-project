public java.lang.String answerCall(int callID, java.lang.String sdpContent) throws net.java.sip.communicator.sip.CommunicationsException {
    try {
        net.java.sip.communicator.sip.SipManager.console.logEntry();
        checkIfStarted();
        return callProcessing.sayOK(callID, sdpContent);
    } finally {
        net.java.sip.communicator.sip.SipManager.console.logExit();
    }
}