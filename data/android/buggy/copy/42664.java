@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    java.lang.System.err.println((("There was an error " + "getting the GeoFire location: ") + databaseError));
    android.widget.Toast.makeText(this, "Permission Denied. Please Login again.", Toast.LENGTH_SHORT).show();
}