@java.lang.Override
public java.net.Proxy getProxy() {
    java.net.SocketAddress addr = new java.net.InetSocketAddress("localhost", getSocksPort());
    proxy = new java.net.Proxy(java.net.Proxy.Type.SOCKS, addr);
    return proxy;
}