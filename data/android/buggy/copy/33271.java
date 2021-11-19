@java.lang.Override
public void onError(java.lang.String message) {
    tv.superawesome.sdk.events.SAEventManager.getIntance().LogAdFailed(loadedAd);
    android.util.Log.d(tv.superawesome.sdk.views.SAPlacementView.TAG, ("Error:" + message));
    if ((listener) != null)
        listener.onAdError(message);
    
}