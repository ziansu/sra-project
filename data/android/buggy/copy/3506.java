@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    android.util.Log.v(org.radare2.installer.WebActivity.TAG, "Error: radare2 webserver did not start");
    mUtils.myToast("Error: radare2 webserver did not start", Toast.LENGTH_LONG);
    finish();
}