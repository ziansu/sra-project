public void goBack() {
    if (this.inAppWebView.canGoBack()) {
        this.inAppWebView.goBack();
    }
}