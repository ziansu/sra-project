@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((checkLocationPermission()) && ((vn.efode.vts.MainActivity.scheduleActive) == null))
        getScheduleLatest(java.lang.String.valueOf(vn.efode.vts.application.ApplicationController.getCurrentUser().getId()));
    
}