@java.lang.Override
protected void onStop() {
    com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
    super.onStop();
}