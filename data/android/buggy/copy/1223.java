public com.google.firebase.database.Query getQuery(com.google.firebase.database.DatabaseReference databaseRef) {
    com.google.firebase.database.Query salonQuery = databaseRef.child("saloons").orderByChild("msgNb");
    return salonQuery;
}