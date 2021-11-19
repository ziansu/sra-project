public org.openstreetmap.josm.data.osm.OsmPrimitive get(int idx) {
    if ((conflicts) == null)
        return null;
    
    return conflicts.get(idx).getMy();
}