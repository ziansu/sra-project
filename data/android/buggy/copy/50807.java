@java.lang.Override
public void onStart() {
    super.onStart();
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    mAuth.addAuthStateListener(mAuthListener);
}