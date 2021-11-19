@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Resume();
    
}