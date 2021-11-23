protected void onPinCodeSuccess() {
    mLockManager.getAppLock().setPasswordVerified(true);
    onPinSuccess(mAttempts);
    mAttempts = 0;
}