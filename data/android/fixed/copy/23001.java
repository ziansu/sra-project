public boolean kill(java.lang.String id) {
    de.haumacher.netsim.Forwarder forwarder = _forwarders.get(id);
    if (forwarder == null) {
        return false;
    }
    forwarder.close();
    return true;
}