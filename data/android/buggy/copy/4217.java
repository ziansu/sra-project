@java.lang.Override
public void run() {
    java.lang.String xmlData = addModelAndInstanceTag(data).replaceAll("\"", "\\\"");
    webView.loadUrl((("javascript:loadDraft('" + xmlData) + "')"));
    android.util.Log.d("posting data", xmlData);
}