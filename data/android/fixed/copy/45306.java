public net.osmand.plus.osmedit.OsmBugResult validateLoginDetails() {
    return editingPOI(net.osmand.plus.osmedit.OsmBugsRemoteUtil.getUserDetailsApi(), net.osmand.plus.osmedit.OsmBugsRemoteUtil.GET, "validate_login", false);
}