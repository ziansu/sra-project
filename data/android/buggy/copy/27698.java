@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    if (status != (android.location.LocationProvider.AVAILABLE))
        currentResult.reset();
    
}