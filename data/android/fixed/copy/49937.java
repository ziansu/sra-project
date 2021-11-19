@java.lang.Override
public android.view.View getVideoLoadingProgressView() {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.getVideoLoadingProgressView();
    }
    return null;
}