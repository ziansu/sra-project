public java.lang.String getGWDeviceId() {
    java.lang.String id;
    id = options.getProperty("Gateway-ID");
    if (id == null) {
        return getDeviceId();
    }
    return trimedValue(id);
}