public org.jboss.netty.channel.Channel start() {
    org.jboss.netty.channel.Channel bind = bootstrap.bind(new java.net.InetSocketAddress(port));
    return bind;
}