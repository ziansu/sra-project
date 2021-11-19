public double getLongitude() {
    if ((locationGPS) != null) {
        longitude = locationGPS.getLongitude();
    }else
        if ((locationNetwork) != null)
            longitude = locationNetwork.getLongitude();
        
    
    return longitude;
}