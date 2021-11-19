public void onStop() {
    gac.disconnect();
    super.onStop();
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    if ((mAuthListener) != null) {
        mAuth.removeAuthStateListener(mAuthListener);
    }
}