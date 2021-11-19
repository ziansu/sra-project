private void initEmptyActivity() {
    if ((mCallLockWindowManager) == null) {
        mCallLockWindowManager = new com.ws.calllocker.CallLockWindowManager(this, this);
        mCallLockWindowManager.startLockView();
    }
}