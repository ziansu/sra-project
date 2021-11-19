@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (false) {
        com.taobao.weex.WXSDKManager.getInstance().notifyTrimMemory();
    }
    if (false) {
        com.taobao.weex.WXSDKManager.getInstance().notifySerializeCodeCache();
    }
}