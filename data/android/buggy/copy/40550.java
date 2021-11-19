private void endGameAsGuest() {
    mGuestFirstConnectted = false;
    unregisterReceiver(mNetworkConnectChangedReceiver);
    getWifiUtils().disableWifi();
    mGuestPlayer.leaveGame();
}