private void initEmptyActivity() {
    mCallLockWindowManager = new com.ws.calllocker.CallLockWindowManager(this, this);
    mCallLockWindowManager.startLockView();
}