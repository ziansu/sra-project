private boolean containsService(java.lang.Class<?> type, java.lang.String serviceClassName) {
    java.util.Map<java.lang.String, java.lang.Object> services = servicesLoaded.get(type);
    return (services != null) && (services.containsKey(serviceClassName));
}