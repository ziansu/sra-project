private java.util.List<java.lang.String> updateMetaServerList() {
    if (com.ctrip.hermes.core.utils.CollectionUtil.isNullOrEmpty(m_metaServerList.get())) {
        m_metaServerList.set(domainToIpPorts());
    }
    return fetchMetaServerListFromExistingMetaServer();
}