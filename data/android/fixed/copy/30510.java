@java.lang.Override
public void run() {
    for (com.facebook.internal.NativeProtocol.NativeAppInfo appInfo : com.facebook.internal.NativeProtocol.facebookAppInfoList) {
        appInfo.fetchAvailableVersions(true);
    }
}