public double getLatitude() {
    if ((locationGPS) != null)
        latitude = locationGPS.getLatitude();
    else
        if ((locationNetwork) != null)
            latitude = locationNetwork.getLatitude();
        
    
    return latitude;
}