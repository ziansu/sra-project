public void setHost(java.lang.String host) {
    if (!(host.contains(org.moskito.central.storage.graylog.GraylogStorageConfig.HTTP_PREFIX))) {
        host += org.moskito.central.storage.graylog.GraylogStorageConfig.HTTP_PREFIX;
    }
    this.host = host;
}