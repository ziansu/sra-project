@java.lang.Override
public boolean isModified() {
    return (cloudSdkPanel.isModified()) || (!(com.google.cloud.tools.intellij.appengine.sdk.CloudSdkService.getInstance().isValidCloudSdk(cloudSdkPanel.getCloudSdkDirectoryText())));
}