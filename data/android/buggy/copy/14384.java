@java.lang.Override
public java.lang.Void doInBackground() {
    try {
        servers = net.connectionutil.ServerDiscoveryUtil.getAvailableServers(1000);
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    }
    return null;
}