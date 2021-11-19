@java.lang.Override
public address.browser.embeddedbrowser.EbDocument getDomElement() {
    return new address.browser.javabrowser.WebViewDocAdapter(this.webView.getEngine().getDocument());
}