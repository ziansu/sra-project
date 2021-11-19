public void addP2pIps(java.util.Set<java.lang.String> p2pIps) {
    com.google.common.base.Preconditions.checkArgument((!(io.subutai.common.util.CollectionUtil.isCollectionEmpty(p2pIps))));
    p2pIps.addAll(p2pIps);
}