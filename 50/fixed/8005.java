protected java.lang.String getHostname() {
    try {
        return java.net.InetAddress.getLocalHost().getHostName();
    } catch (java.net.UnknownHostException e) {
        return "localhost";
    }
}