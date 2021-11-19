@java.lang.Override
public void onClick(android.view.View v) {
    m.togglePeriodicLocationUpdates();
    if (!(m.mRequestingLocationUpdates)) {
        startLocationUpdatesButton.setText(getString(R.string.stop_location_updates_button));
    }else {
        startLocationUpdatesButton.setText(getString(R.string.start_location_updates_button));
    }
}