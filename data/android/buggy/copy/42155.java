public void setStringAnswer(java.lang.String answer) throws java.rmi.UnexpectedException {
    if ((_inputState) == (org.akquinet.audit.ui.DelayedHtmlUserCommunicator.InputState.STRING_EXPECTED)) {
        _stringAnswer = answer;
        _inputWaiter.notifyAll();
    }else {
        throw new java.rmi.UnexpectedException("Internal Error: String expected.");
    }
}