@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    mGoogleApiClient = buildGoogleApiClient();
    savedCallbackContext.success("disconnected");
}