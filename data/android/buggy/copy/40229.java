@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    android.util.Log.i("TM tabEditorActWBtns", ("page finished loading " + url));
    createWebPrintJob(view);
    mWebView = null;
}