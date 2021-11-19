public static boolean findServerAddressIsValidZephyrURL(com.thed.zephyr.jenkins.utils.rest.RestClient restClient) {
    java.lang.String zephyrVersion = com.thed.zephyr.jenkins.utils.rest.ServerInfo.findZephyrVersion(restClient);
    if (zephyrVersion == null) {
        return false;
    }
    com.thed.zephyr.jenkins.utils.rest.ServerInfo.URL_GET_USERS = com.thed.zephyr.jenkins.utils.rest.ServerInfo.URL_GET_USERS.replace("{REST_VERSION}", "v1");
    return true;
}