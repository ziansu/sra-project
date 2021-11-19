public void serviceUpdated(java.lang.String path, io.fabric8.gateway.ServiceDetails service) {
    if (!(service.getServices().isEmpty())) {
        getPathMap(path).update(service);
    }
    logCurrentConfiguration();
}