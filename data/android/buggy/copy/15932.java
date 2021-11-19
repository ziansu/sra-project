@java.lang.Override
public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    webView.setWebChromeClient(new com.zengularity.acraplugin.AcraPlugin.AcraChromeClient(cordova, webView) {    });
}