public com.spotify.helios.servicescommon.ZooKeeperRegistrarService.Builder setZKRegistrationSignal(final java.util.concurrent.CountDownLatch zkRegistrationSignal) {
    this.zkRegistrationSignal = java.util.Optional.of(zkRegistrationSignal);
    return this;
}