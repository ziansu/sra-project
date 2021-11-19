public void onReceivedTitle(android.webkit.WebView webView, java.lang.String title) {
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.getSupportActionBar().setSubtitle(title);
}