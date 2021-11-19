public void cleanup() {
    if ((this.rctx) == null) {
        org.opentripplanner.routing.core.RoutingRequest.LOG.warn("routing context was not set, cannot destroy it.");
    }else {
        rctx.destroy();
        org.opentripplanner.routing.core.RoutingRequest.LOG.debug("routing context destroyed");
    }
}