@java.lang.Override
public boolean onBack() {
    if (((webView) != null) && (webView.canGoBack())) {
        webView.goBack();
        return false;
    }else {
        return true;
    }
}