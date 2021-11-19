@java.lang.Override
public void operationComplete(net.tomp2p.futures.FutureResponse future) throws java.lang.Exception {
    if (future.isFailed()) {
        net.tomp2p.p2p.builder.DiscoverBuilder.LOG.warn("FutureDiscover (2): UDP failed connection {} - {}", future, futureDiscover.failedReason());
    }
}