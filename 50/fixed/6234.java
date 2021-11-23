@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    mNest.removeAllListeners();
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}