@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.w("Event Listener", "loadHunt:onCancelled", databaseError.toException());
}