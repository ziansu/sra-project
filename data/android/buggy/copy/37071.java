public void close() {
    firebaseAuth.signOut();
    database.goOffline();
    database.getReference().setValue(null);
    database.goOnline();
    removeListeners();
}