@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    Wearable.DataApi.addListener(mGoogleApiClient, this);
    android.util.Log.d(LOG_TAG, "onConnected");
}