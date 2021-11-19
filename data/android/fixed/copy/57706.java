@com.facebook.react.bridge.ReactMethod
public void getApiVersion(com.facebook.react.bridge.Callback callback) {
    if ((api) == null) {
        callback.invoke(com.theweflex.react.WeChatModule.NOT_REGISTERED);
        return ;
    }
    callback.invoke(null, api.getWXAppSupportAPI());
}