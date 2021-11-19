void clearConnection() {
    mWasOomProtected = mConnection.isOomProtectedOrWasWhenDied();
    org.chromium.content.browser.BindingManagerImpl.ModerateBindingPool moderateBindingPool;
    synchronized(mModerateBindingPoolLock) {
        moderateBindingPool = mModerateBindingPool;
    }
    if (moderateBindingPool != null)
        moderateBindingPool.removeConnection(this);
    
    mConnection = null;
}