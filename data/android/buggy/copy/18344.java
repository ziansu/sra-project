@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    handlerBackground.removeMessages(jarp.mx.com.basichandler.MainActivity.OperationInMainThread);
    handlerBackground.removeMessages(jarp.mx.com.basichandler.MainActivity.OperationInBackGround);
    handlerBackground.getLooper().quit();
}