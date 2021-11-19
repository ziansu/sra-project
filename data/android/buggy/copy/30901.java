public final java.util.Set<java.lang.String> getHosts() {
    synchronized(hosts) {
        return hosts.keySet();
    }
}