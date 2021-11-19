protected com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient createOAuthWebViewClient() {
    return new com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient(this, mRedirectUrl);
}