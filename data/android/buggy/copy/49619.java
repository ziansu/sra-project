@java.lang.Override
protected void onResume() {
    super.onResume();
    mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    if ((mAuthStateListener) != null) {
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }
}