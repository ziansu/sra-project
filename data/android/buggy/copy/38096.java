@java.lang.Override
public void onRevMobRewardedVideoFinished() {
    android.util.Log.d(com.cranberrygame.cordova.plugin.ad.revmob.RevMobPluginOverlap.LOG_TAG, java.lang.String.format("%s", "onRevMobRewardedVideoFinished"));
    org.apache.cordova.PluginResult pr = new org.apache.cordova.PluginResult(PluginResult.Status.OK, "onRewardedVideoAdHidden");
    pr.setKeepCallback(true);
    plugin.getCallbackContextKeepCallback().sendPluginResult(pr);
}