@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.qi.xiaohui.dingdang.model.webcontent.WebContent>> call, java.lang.Throwable t) {
    android.util.Log.i("error", t.toString());
    webView.setWebViewClient(new android.webkit.WebViewClient());
    _loadUrl();
}