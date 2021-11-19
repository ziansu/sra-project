public void run() {
    sslhoff.SslProxyConnect connector = new sslhoff.SslProxyConnect(proxyDefinition, logger);
    for (java.lang.String urlString : urlStrings) {
        try {
            connector.connectTo(urlString);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}