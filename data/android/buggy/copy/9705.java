@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    webView = reactContext;
    enableFileUpload(webView);
    return webView;
}