public void startBrowser() {
    java.lang.String url = com.freedom.freeclient.freeclient.util.Util.readFromProxyFile(proxyFile);
    android.net.Uri uriUrl = android.net.Uri.parse(url);
    android.content.Intent launchBrowser = new android.content.Intent(android.content.Intent.ACTION_VIEW, uriUrl);
    startActivity(launchBrowser);
}