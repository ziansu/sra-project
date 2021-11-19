protected java.lang.String getIpAddress(boolean usePublicAddress) {
    if (usePublicAddress && ((globalIpAddress) != null)) {
        return globalIpAddress;
    }else {
        return mostOutboundAddress;
    }
}