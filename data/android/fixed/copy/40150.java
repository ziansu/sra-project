public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    org.indywidualni.fblite.webview.MyWebViewClient.webView.loadUrl(page.get(position));
    dialog.dismiss();
}