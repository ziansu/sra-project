@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String previousChildName) {
    android.util.Log.d(tpdev.megaphone.MapsActivity.TAG, ("onChildAdded:" + (dataSnapshot.getKey())));
}