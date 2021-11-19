public void clear() throws net.continuumsecurity.proxy.ProxyException {
    try {
        clientApi.ascan.removeAllScans(apiKey);
        clientApi.core.newSession(apiKey, "", "");
    } catch (net.continuumsecurity.proxy.ClientApiException e) {
        e.printStackTrace();
        throw new net.continuumsecurity.proxy.ProxyException(e);
    }
}