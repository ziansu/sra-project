protected java.lang.String getServiceId(java.lang.String orgId, java.lang.String serviceId, java.lang.String version) {
    return (((orgId + ":") + serviceId) + ":") + version;
}