public void delete(java.lang.String id) {
    T elem = findById(id);
    com.firebase.client.Firebase mRef = new com.firebase.client.Firebase(FIREBASE_URI).child(getObjectReference());
    mRef.child(id).removeValue();
}