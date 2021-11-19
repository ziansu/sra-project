@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mTimeout = false;
    if (mProgressBar.isShown()) {
        mProgressBar.setVisibility(View.INVISIBLE);
        mWebView.setVisibility(View.VISIBLE);
    }
}