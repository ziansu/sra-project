@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(getApplicationContext(), "Peer Discovery ready", Toast.LENGTH_SHORT).show();
    android.util.Log.d("WiFiDBC", "Peer Discovery ready");
}