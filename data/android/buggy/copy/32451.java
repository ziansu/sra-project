public java.util.Set<org.onosproject.net.ConnectPoint> getEgressConnectPoints() {
    java.util.Set<org.onosproject.net.ConnectPoint> cps = new org.apache.commons.collections.set.ListOrderedSet();
    for (org.onosproject.mfwd.impl.McastConnectPoint mcp : egressPoints) {
        cps.add(mcp.getConnectPoint());
    }
    return cps;
}