protected void deleteAuthStateListener() {
    if ((mAuthStateListener) != null) {
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }
}