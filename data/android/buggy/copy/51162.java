@java.lang.Override
public void onGeoQueryReady() {
    java.lang.System.out.println("All initial data has been loaded and events have been fired!");
    android.widget.Toast.makeText(this, "service ready", Toast.LENGTH_SHORT).show();
}