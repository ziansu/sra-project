protected boolean exchangePossible() {
    return target.getCurrentRegion().connectsByBridge(occupancy.getRegion());
}