@java.lang.Override
public void onStart() {
    email_password_buttons = $missing$;
    super.onStart();
    com.google.firebase.auth.FirebaseUser currentUser = mAuth.getCurrentUser();
    updateUI(currentUser);
}