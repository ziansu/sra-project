public void stopTracking() {
    stopLocationUpdates(getGoogleApiClient());
    com.chernandezgil.farmacias.Utilities.Utils.logD(com.chernandezgil.farmacias.ui.fragment.GPSTrackerFragment.LOG_TAG, "stopLocationUpdates");
}