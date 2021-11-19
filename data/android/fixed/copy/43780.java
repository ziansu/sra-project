public void unbindCustomTabsService(android.app.Activity activity) {
    if ((mConnection) == null)
        return ;
    
    activity.unbindService(mConnection);
    mClient = null;
    mCustomTabsSession = null;
    mConnection = null;
}