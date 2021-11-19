void disconnect() {
    if ((mService) == null)
        return ;
    
    mContext.unbindService(mConnection);
    mContext = null;
    mService = null;
    mHandler.removeCallbacksAndMessages(null);
}