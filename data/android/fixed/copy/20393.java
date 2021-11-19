@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    bnotif = dataSnapshot.getValue(boolean.class);
    if (bnotif) {
        thread = true;
        run_pug();
        android.util.Log.d("Stop", "running");
    }
}