@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.w("Event Listener", "loadHunt:onCancelled", databaseError.toException());
    android.widget.Toast.makeText(getActivity(), "Failed to retrieve hunt info.", Toast.LENGTH_SHORT).show();
}