@java.lang.Override
public void onStart() {
    showHomeScreen();
    changeScreenRotationMode(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    setupConnectivityState(true);
    buildGPSDialog(getResources().getString(R.string.service_turn_gps_on_title), getResources().getString(R.string.service_turn_gps_on_detail));
}