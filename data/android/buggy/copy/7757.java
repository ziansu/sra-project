public void goToCurrentLocation(com.google.android.gms.maps.model.LatLng latLng, java.lang.String currentAddress) {
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.DEFAULT_ZOOM);
    map.animateCamera(cameraUpdate);
    removeLocationUpdates();
    setTextAutocompleteFragmentWithText(currentAddress);
}