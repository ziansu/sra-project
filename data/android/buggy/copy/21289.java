public void setHostname(java.lang.String host) throws java.io.IOException {
    hostname = host;
    this.host = java.net.InetAddress.getByName(host).getAddress();
}