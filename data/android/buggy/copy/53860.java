public void run() {
    for (java.lang.String urlString : urlStrings) {
        sslhoff.SslProxyConnect connector = new sslhoff.SslProxyConnect(proxyDefinition, logger);
        try {
            connector.connectTo(urlString);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}