@java.lang.Override
public void onAdClosed() {
    if ((appState) == (org.dkf.jmule.activities.MainActivity.APP_STATE.ACTIVE))
        requestNewInterstitial();
    
}