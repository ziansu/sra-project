@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    android.webkit.WebView webView = reactContext;
    enableFileUpload(webView);
    return webView;
}