@java.lang.Override
public void onUnhandledKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) {
    if (!(mInForeground)) {
        return ;
    }
    if (!(mWebViewController.onUnhandledKeyEvent(event))) {
        super.onUnhandledKeyEvent(view, event);
    }
}