private static java.lang.String getProxyValue(java.lang.String key) {
    if (((org.ovirt.engine.ui.uicommonweb.models.hosts.FenceProxyUtils.proxyMap) != null) && (org.ovirt.engine.ui.uicommonweb.models.hosts.FenceProxyUtils.proxyMap.containsKey(key))) {
        return org.ovirt.engine.ui.uicommonweb.models.hosts.FenceProxyUtils.proxyMap.get(key);
    }
    return key;
}