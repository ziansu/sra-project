@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot snapshot) {
    if ((snapshot.getValue()) == null) {
        dbRef.child("users").child(u.id).setValue(u);
    }
}