public static boolean findServerAddressIsValidZephyrURL(com.thed.zephyr.jenkins.utils.rest.RestClient restClient) {
    com.thed.zephyr.jenkins.utils.rest.ServerInfo.URL_GET_USERS = com.thed.zephyr.jenkins.utils.rest.ServerInfo.URL_GET_USERS.replace("{REST_VERSION}", "v1");
    return true;
}