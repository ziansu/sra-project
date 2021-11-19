public SCBot.RegionGraph.RegionStatus getRegionStatus(bwapi.Position position) {
    return this.nodes.get(SCBot.RegionGraph.generateId(bwta.BWTA.getRegion(position))).status;
}