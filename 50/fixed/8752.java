private void restartTango() {
    if ((mParameterNode) != null)
        mParameterNode.setPreferencesFromParameterServer();
    
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}