@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (_targetView != null) {
        if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.KITKAT)) {
            _targetView.evaluateJavascript(_jsString, null);
        }else {
            _targetView.loadUrl(("javascript:" + _jsString));
        }
    }
}