@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void run() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT)) {
        inAppWebView.load(("javascript:" + finalScriptToInject), null);
    }else {
        inAppWebView.evaluateJavascript(finalScriptToInject, null);
    }
}