public void delete(java.lang.String id) {
    com.firebase.client.Firebase mRef = firebase.child(getObjectReference());
    mRef.child(id).removeValue();
    map.remove(id);
}