public void close() {
    firebaseAuth.signOut();
    removeListeners();
}