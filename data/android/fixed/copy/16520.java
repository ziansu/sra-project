private void registerForLocationUpdates() {
    com.teamagam.gimelgimel.app.model.ViewsModels.MessageBroadcastReceiver.registerReceiver(getActivity(), mUserLocationReceiver);
    com.teamagam.gimelgimel.app.control.sensors.LocationFetcher.getInstance(getActivity()).registerReceiver(mLocationReceiver);
}