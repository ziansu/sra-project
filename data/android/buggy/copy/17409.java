public void setHost(java.lang.String host) {
    if (sun.net.util.IPAddressUtil.isIPv6LiteralAddress(host)) {
        host = java.lang.String.format("[%s]", host);
    }
    this.host = host;
}