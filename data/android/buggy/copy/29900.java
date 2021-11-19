@java.lang.Override
public void onStop() {
    super.onStop();
    if ((mAuthListener) != null) {
        mAuth.removeAuthStateListener(mAuthListener);
    }
    com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
}