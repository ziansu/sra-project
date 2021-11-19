@java.lang.Override
public void onActivityUpdated(com.google.android.gms.location.DetectedActivity a) {
    android.widget.Toast.makeText(getApplicationContext(), ("Latitude : " + (com.example.omair.minethetag.LoginActivity.latitude)), Toast.LENGTH_SHORT).show();
}