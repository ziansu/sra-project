void handlePostDhcpSetup() {
    setSuspendOptimizationsNative(com.android.server.wifi.WifiStateMachine.SUSPEND_DUE_TO_DHCP, true);
    mWifiNative.setPowerSave(true);
    mWifiP2pChannel.sendMessage(WifiP2pServiceImpl.BLOCK_DISCOVERY, WifiP2pServiceImpl.DISABLED);
    mWifiNative.setBluetoothCoexistenceMode(mWifiNative.BLUETOOTH_COEXISTENCE_MODE_SENSE);
    mDhcpActive = false;
    com.android.server.wifi.WifiNative.restartScan();
}