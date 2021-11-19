public java.util.List<java.lang.String> peerCapabilities() {
    if (prop.isEmpty())
        return org.ethereum.config.SystemProperties.DEFAULT_PROTOCOL_LIST;
    
    java.lang.String capabilitiesList = prop.getProperty("peer.capabilities");
    return java.util.Arrays.asList(capabilitiesList.split(","));
}