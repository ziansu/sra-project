@java.lang.Override
public void onClick(android.view.View v) {
    if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    }else {
        startPlotting();
    }
}