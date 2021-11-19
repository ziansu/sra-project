@java.lang.Override
public void onRewardedVideoFailedToLoad() {
    showToastOnTesting("onRewardedVideoFailedToLoad");
    org.godotengine.godot.GodotLib.calldeferred(instanceId, "_on_rewarded_video_failed_to_load", new java.lang.Object[]{  });
}