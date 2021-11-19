private void endGameAsGuest() {
    mGuestPlayer.leaveGame();
    mGuestFirstConnectted = false;
    unregisterReceiver(mNetworkConnectChangedReceiver);
    getWifiUtils().disableWifi();
}