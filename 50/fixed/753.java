@java.lang.Override
public void onAdFailedToLoad(int error) {
    android.util.Log.d(com.samcodes.admob.InterstitialListener.TAG, "onInterstitialFailedToLoad");
    com.samcodes.admob.AdMobExtension.callHaxe("onInterstitialFailedToLoad", new java.lang.Object[]{ id });
}