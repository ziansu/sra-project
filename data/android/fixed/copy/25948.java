@javax.annotation.concurrent.GuardedBy(value = "lock")
final void finishReplay(final org.opendaylight.controller.cluster.access.client.ReconnectForwarder forwarder) {
    setForwarder(forwarder);
    lock.unlock();
}