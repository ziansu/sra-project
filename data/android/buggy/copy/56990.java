@java.lang.Override
public void onConnectionSuspended(int i) {
    android.widget.Toast.makeText(this, "onConnectionSuspended", Toast.LENGTH_SHORT).show();
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnectionSuspended(): attempting to reconnect");
    googleApiClient.connect();
}