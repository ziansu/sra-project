public void onInterstitialAdDismissed(com.rfm.sdk.RFMAdView adView) {
    if ((com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView) != null)
        com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.setVisibility(View.GONE);
    
    com.rfm.extras.adapters.RFMViewInterstitialActivity.dismissActivity();
    android.util.Log.v("LOG_TAG", "RFM Ad: Interstitial ad dismissed");
}