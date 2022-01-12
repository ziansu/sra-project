public void run() {
    if ((mWebView) == null) {
        return ;
    }
    mWebView.loadUrl(("javascript:" + js));
}