public void update() {
    com.example.daniel.app0.MyLocationListener.mLocationManager.requestLocationUpdates(com.example.daniel.app0.MyLocationListener.mProvider, com.example.daniel.app0.MyLocationListener.TIEMPO_MIN, com.example.daniel.app0.MyLocationListener.DISTANCIA_MIN, this);
    mLoc = getLastKnownLocation();
}