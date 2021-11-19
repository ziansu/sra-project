private void webView(java.lang.String url) {
    in.foodtalk.privilege.fragment.WebViewFrag webViewFrag = new in.foodtalk.privilege.fragment.WebViewFrag();
    webViewFrag.url = url;
    setFragmentView(webViewFrag, R.id.container, "webViewLegal", true);
    drawerLayout.closeDrawer(Gravity.LEFT);
}