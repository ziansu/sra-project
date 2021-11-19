@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    timber.log.Timber.d(("location string: " + (location.toString())));
    this.location = location;
}