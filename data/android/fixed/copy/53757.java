@java.lang.Override
public void onLoopMeVideoAdLoadSuccess(com.loopme.LoopMeNativeVideoAd arg0) {
    toast("onLoopMeVideoAdLoadSuccess");
    showAdIfItVisible(mCustomAdapter);
}