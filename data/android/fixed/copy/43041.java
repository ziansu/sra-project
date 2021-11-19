public void setBooleanAnswer(boolean answer) throws java.rmi.UnexpectedException {
    if ((_inputState) == (org.akquinet.audit.ui.DelayedHtmlUserCommunicator.InputState.BOOLEAN_EXPECTED)) {
        _yesNoAnswer = answer;
        synchronized(_inputWaiter) {
            _inputWaiter.notifyAll();
        }
    }else {
        throw new java.rmi.UnexpectedException("Internal Error: Boolean expected.");
    }
}