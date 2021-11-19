private void scheduleKeepalive() {
    com.google.common.base.Preconditions.checkState(((currentDeviceRpc) != null));
    org.opendaylight.netconf.sal.connect.netconf.sal.KeepaliveSalFacade.LOG.trace("{}: Scheduling next keepalive in {} {}", id, keepaliveDelaySeconds, java.util.concurrent.TimeUnit.SECONDS);
    currentKeepalive = executor.schedule(new org.opendaylight.netconf.sal.connect.netconf.sal.KeepaliveSalFacade.Keepalive(currentKeepalive), keepaliveDelaySeconds, java.util.concurrent.TimeUnit.SECONDS);
}