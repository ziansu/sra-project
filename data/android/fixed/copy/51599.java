@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    buildGoogleApiClient();
    savedCallbackContext.success("disconnected");
}