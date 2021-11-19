public java.lang.Object removeProxy(java.lang.String objectId) {
    synchronized(proxyIdToProxyMap) {
        return proxyIdToProxyMap.remove(objectId);
    }
}