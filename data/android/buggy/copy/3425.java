public com.google.firebase.database.Query getQuery(com.google.firebase.database.DatabaseReference databaseReference) {
    return databaseReference.child("users").child(getUid()).child("notification").limitToFirst(100).orderByChild("time");
}