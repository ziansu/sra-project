public void disconnectService() {
    mService.getBleManager().stopScan();
    unbindService(mConnection);
}