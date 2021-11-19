@java.lang.Override
public void onInterstitialLoaded(com.mopub.mobileads.MoPubInterstitial interstitial) {
    android.util.Log.d(BuildConfig.LOG_TAG, "Interstitial loaded");
    listener.onAdLoaded(adapter);
}