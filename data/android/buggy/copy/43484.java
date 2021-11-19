@java.lang.Override
public java.util.List<db.Treasure> getTreasures(int userId, db.GeoLocation location, double radius) {
    return dataBaseSupervisor.getTreasuresNearLocation(location.getLon(), location.getLat(), radius);
}