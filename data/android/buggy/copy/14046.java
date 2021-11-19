@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    com.gigigo.ggglogger.GGGLogImpl.log("CloudRecognitionActivityLifeCycleCallBack.onActivityDestroyed");
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Destroy();
    
    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
}