public java.util.List<net.osmand.data.LatLon> getIntermediatePointsLatLon() {
    java.util.List<net.osmand.data.LatLon> intermediatePointsLatLon = new java.util.ArrayList<net.osmand.data.LatLon>();
    for (net.osmand.plus.TargetPointsHelper.TargetPoint t : this.intermediatePoints) {
        intermediatePointsLatLon.add(t.point);
    }
    return intermediatePointsLatLon;
}