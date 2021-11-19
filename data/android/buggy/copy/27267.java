@java.lang.Override
public void onAuthenticationFailed() {
    super.onAuthenticationFailed();
    callback.onError("指纹校验失败！");
}