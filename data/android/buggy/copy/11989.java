@java.lang.Override
public void onStart() {
    super.onStart();
    client.connect();
    isDropped = preferences.getBoolean(charlyn23.c4q.nyc.projectx.ProjectXMapFragment.MARKER_DROPPED, false);
}