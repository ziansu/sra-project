public void close() {
    com.yumcouver.tunnel.client.serversocket.ProxyClientHandler proxyClientHandler = com.yumcouver.tunnel.client.serversocket.ProxyClientHandler.keyProxyClientHandlerMappings.remove(key);
    ctx.close();
    proxyClient.close();
    com.yumcouver.tunnel.client.serversocket.ProxyClientHandler.LOGGER.info("Porxy Client closed");
}