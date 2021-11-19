@java.lang.Override
public void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) {
    if ((gtListener) != null) {
        gtListener.gtError();
    }
}