public boolean validateDistance(com.google.android.gms.maps.model.LatLng passengerLocation, com.google.android.gms.maps.model.LatLng userLocation) {
    if ((distance(passengerLocation.latitude, passengerLocation.longitude, userLocation.latitude, userLocation.longitude)) <= 0.1) {
        return true;
    }else {
        return false;
    }
}