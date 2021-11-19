public void delete(java.lang.String id) {
    firebase.child(id).removeValue();
    map.remove(id);
}