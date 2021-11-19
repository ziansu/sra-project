@java.lang.Override
public java.lang.Void doInBackground() {
    servers = net.connectionutil.ServerDiscoveryUtil.getAvailableServers(1000);
    return null;
}