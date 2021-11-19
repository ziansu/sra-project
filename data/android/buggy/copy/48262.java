@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    android.util.Log.d("saas", "cancel");
    android.util.Log.w("Oye", "Failed to read value.", error.toException());
}