@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.howell.protocol.utils.SDKDebugLog.LogEnable(true);
    initPlayView();
    initFun();
    start();
}