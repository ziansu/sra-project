public void init(com.google.android.gms.maps.GoogleMap mMap) {
    userLocTmp = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(userLoc).title("your current location"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(userLoc));
}