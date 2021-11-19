private void updateMetaServerList() {
    if (com.ctrip.hermes.core.utils.CollectionUtil.isNullOrEmpty(m_metaServerList.get())) {
        m_metaServerList.set(domainToIpPorts());
    }
    m_metaServerList.set(fetchMetaServerListFromExistingMetaServer());
}