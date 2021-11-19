public boolean persistConf(org.apache.solr.handler.admin.SecurityConfig securityConfig) throws java.io.IOException {
    securityJsonPath = org.apache.solr.core.SolrResourceLoader.locateSolrHome().resolve("security.json");
    return super.persistConf(securityConfig);
}