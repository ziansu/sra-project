private void startServiceDiscovery() {
    _manager.discoverServices(_channel, new net.sharksystem.android.protocols.wifidirect.WifiActionListener("Discover services"));
}