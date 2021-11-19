@java.lang.Override
public boolean isConnected() {
    synchronized(mySocketObject) {
        return (myState) == (com.jetbrains.python.debugger.pydev.transport.ClientModeDebuggerTransport.State.APPROVED);
    }
}