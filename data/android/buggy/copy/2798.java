@java.lang.Override
public void onStart(android.content.Context pContext, android.os.Bundle arg1, java.lang.String[] arg2) {
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
    cn.jpush.android.api.JPushInterface.init(pContext);
}