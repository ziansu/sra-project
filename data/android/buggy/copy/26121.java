@java.lang.Override
public java.util.List<db.Treasure> getTreasures(db.GeoLocation location, double radius) {
    radius = radius / 6371000;
    return dataBaseSupervisor.getTreasuresNearLocation(location.getLon(), location.getLat(), radius);
}