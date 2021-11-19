@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    ((com.firebase.ui.FirebaseRecyclerAdapter) (mAdapter)).cleanup();
    mFirebaseRef.removeAuthStateListener(mAuthListener);
}