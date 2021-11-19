synchronized void disconnected() {
    com.tc.net.groups.TCGroupManagerImpl.debugWarn(((("[TCGroupHandshakeStateMachine]: Group member handshake disconnected. " + (stateInfo(current))) + ", for channel: ") + (channel)));
    switchToState(STATE_FAILURE);
}