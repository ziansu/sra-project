@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.widget.Toast.makeText(this, "onConnected", Toast.LENGTH_SHORT).show();
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnected(): connected to Google APIs");
}