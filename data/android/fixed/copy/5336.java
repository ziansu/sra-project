private void updateFirebaseStorage(java.lang.String tripId) {
    com.google.firebase.storage.StorageReference reference = com.grp10.codepath.travelmemo.app.MemoApplication.getFBStorageReference();
    com.google.firebase.storage.StorageReference tripRef = reference.child(tripId);
    userRef = tripRef.child(userId);
}