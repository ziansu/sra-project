private com.google.firebase.auth.FirebaseAuth getFirebaseAutenticador() {
    if ((autenticador) == null) {
        autenticador = com.google.firebase.auth.FirebaseAuth.getInstance();
    }
    return autenticador;
}