@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mReactInstanceManager) != null) {
        mReactInstanceManager.onResume(this, this);
    }
}