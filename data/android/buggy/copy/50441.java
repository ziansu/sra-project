@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).build();
    mGoogleApiClient.connect();
}