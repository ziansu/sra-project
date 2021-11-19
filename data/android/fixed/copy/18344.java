@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    handlerBackground.getLooper().quit();
}