protected void onCommunicationError() {
    if ((myState) == (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.APPROVED)) {
        getDebugger().fireCommunicationError();
    }
}