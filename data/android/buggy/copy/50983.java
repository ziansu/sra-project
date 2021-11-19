public void removeWebView(android.view.ViewGroup parent) {
    boolean isWebView = isWebViewShowing(parent);
    parent.setTag("");
    if (isWebView) {
        removeChildViews(parent);
    }
}