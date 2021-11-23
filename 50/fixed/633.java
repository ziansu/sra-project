@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    if ((mListener) != null) {
        mListener.stopDownLoadAnimation();
    }
}