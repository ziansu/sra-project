public boolean contains(java.net.InetAddress inetAddress1) {
    if ((mask) == (-1)) {
        return true;
    }
    return ((org.jboss.netty.handler.ipfilter.IpV4Subnet.toInt(inetAddress1)) & (mask)) == (subnet);
}