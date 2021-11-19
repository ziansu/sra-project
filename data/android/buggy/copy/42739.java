@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mAuthListener) != null) {
        mAuth.removeAuthStateListener(mAuthListener);
    }
}