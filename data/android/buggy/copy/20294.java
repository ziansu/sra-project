public void disconnect() {
    mHandler.removeCallbacks(mPruneTask);
    mService.setBeaconEventListener(null);
    mContext.unbindService(this);
}