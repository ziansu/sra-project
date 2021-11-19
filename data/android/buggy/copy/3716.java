public void getHashtag(java.lang.String name, com.google.firebase.database.ValueEventListener listener) {
    android.util.Log.d("___", name);
    com.google.firebase.database.DatabaseReference dataRef = ref.child("Hashtags").child(name);
    dataRef.addValueEventListener(listener);
}