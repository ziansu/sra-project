private java.lang.String getZephyrRestVersion(com.thed.zephyr.jenkins.utils.rest.RestClient restClient) {
    java.lang.String zephyrVersion = com.thed.zephyr.jenkins.utils.rest.ServerInfo.findZephyrVersion(restClient);
    java.lang.String zephyrRestVersion = "v1";
    return zephyrRestVersion;
}