public org.openstreetmap.josm.data.osm.OsmPrimitive get(int idx) {
    return (conflicts) != null ? conflicts.get(idx).getMy() : null;
}