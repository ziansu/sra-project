@java.lang.Override
public void onNetworkDisconnected() {
    android.util.Log.e("Network", "Network DISSSSSS");
    android.widget.Toast.makeText(this, "Disconnected", Toast.LENGTH_SHORT).show();
}