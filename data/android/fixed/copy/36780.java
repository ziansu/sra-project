@java.lang.Override
public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
    if ((wasPlayingMusic) && (!(shutdownAfter))) {
        com.frostwire.android.offers.AppLovinInterstitialAdapter.LOG.info("adDisplayed(): wasPlaying and not shutting down, resuming player playback");
        com.andrew.apollo.utils.MusicUtils.play();
    }
}