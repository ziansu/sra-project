@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    webView.clearCache(true);
}