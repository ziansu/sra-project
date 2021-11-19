private void onLocation(android.location.Location location) {
    for (int i = 0; i < (_locationListeners.size()); i++) {
        _locationListeners.get(i).onLocation(location);
    }
}