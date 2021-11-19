protected org.jbei.ice.lib.dto.web.RegistryPartner requestToJoin(java.lang.String masterUrl, org.jbei.ice.lib.dto.web.RegistryPartner partner) {
    org.jbei.ice.services.rest.IceRestClient restClient = org.jbei.ice.services.rest.IceRestClient.getInstance();
    return restClient.post(masterUrl, "/rest/partners", partner, org.jbei.ice.lib.dto.web.RegistryPartner.class);
}