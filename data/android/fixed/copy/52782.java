@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    super.onReceivedError(view, request, error);
    hideProgress();
    displayError();
}