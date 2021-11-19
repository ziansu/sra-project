@java.lang.Override
protected void onServiceDisconnect() {
    if ((mService) != null) {
        try {
            mService.destory(mInvokeCallback);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }
}