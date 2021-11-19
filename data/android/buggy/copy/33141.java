@java.lang.Override
public void checkLocationServices(com.rooksoto.parallel.utility.geolocation.ParallelLocation locationService) {
    locationService.startGeofenceMonitoring(view.getContext());
}