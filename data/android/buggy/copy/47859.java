public void addLocationHandler(final de.master.kd.epic.view.map.EpicMap epicMap, final de.master.kd.epic.view.map.interfaces.LocationHandler locationHandler) {
    if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
        doNetworkRequest(epicMap, locationHandler);
    }else
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            doGpsRequest(epicMap);
        }
    
}