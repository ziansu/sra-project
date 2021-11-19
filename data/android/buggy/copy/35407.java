@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot snapshot) {
    if (snapshot == null) {
        dbRef.child("users").child(u.id).setValue(u);
    }
}