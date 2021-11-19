@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    if ((connectionResult.getErrorCode()) == (com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED)) {
        android.util.Log.i(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Google play service not updated");
    }
    locationUpdateListener.cannotReceiveLocationUpdates();
}