@java.lang.Override
public java.util.List<db.Treasure> getTreasures(db.GeoLocation location, double radius) {
    return dataBaseSupervisor.getTreasuresNearLocation(location.getLon(), location.getLat(), radius);
}