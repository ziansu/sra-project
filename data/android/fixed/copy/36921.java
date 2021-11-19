public static java.lang.String getUserEmail() {
    com.google.firebase.auth.FirebaseUser firebaseUser = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    if (firebaseUser != null) {
        return firebaseUser.getEmail();
    }
    return null;
}