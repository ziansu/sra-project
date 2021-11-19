public java.lang.String getApiKey() {
    if ((headerApiKey) == null) {
        headerApiKey = getPropertyByKey(org.ednovo.gooru.server.service.API_KEY);
    }
    org.ednovo.gooru.server.service.BaseServiceImpl.getLogger().info(("getApiKey : " + (headerApiKey)));
    return headerApiKey;
}