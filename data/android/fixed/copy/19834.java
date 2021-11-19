@java.lang.Override
protected void doStart(com.mpush.api.service.Listener listener) throws java.lang.Throwable {
    com.mpush.api.spi.common.ServiceDiscoveryFactory.create().syncStart();
    com.mpush.api.spi.common.CacheManagerFactory.create().init();
    PushRequestBus.I.syncStart();
    factory.start(listener);
}