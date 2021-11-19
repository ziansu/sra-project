protected net.sharkfw.protocols.Stub createWifiDirectStreamStub(net.sharkfw.asip.SharkStub kepStub) throws net.sharkfw.kep.SharkProtocolNotSupportedException {
    if ((currentStub) == null) {
        currentStub = new net.sharksystem.android.protocols.wifidirect.WifiDirectStreamStub(context, activityRef);
        currentStub.setHandler(((net.sharkfw.protocols.RequestHandler) (kepStub)));
    }
    return currentStub;
}