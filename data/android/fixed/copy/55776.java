@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.widget.Toast.makeText(getApplicationContext(), "Please Enable Location", Toast.LENGTH_LONG).show();
    if ((actionBarMenu) != null) {
        actionBarMenu.findItem(R.id.action_park).setVisible(false);
    }
}