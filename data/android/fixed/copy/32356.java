@java.lang.Override
protected void onStart() {
    super.onStart();
    android.webkit.WebView myWebView = ((android.webkit.WebView) (findViewById(R.id.noteView)));
    noteViewClient = new com.kjipo.eartrainingandroid.CustomWebViewClient();
    noteViewClient.attachWebView(myWebView);
}