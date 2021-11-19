@java.lang.Override
public void onActivityResult(android.app.Activity activity, int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.showlocationservicesdialogbox.LocationServicesDialogBoxModule.ENABLE_LOCATION_SERVICES)) {
        currentActivity = activity;
        checkLocationService(true);
    }
}