public org.openstreetmap.josm.data.validation.TestError.Builder primitives(java.util.Collection<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> primitives) {
    org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.primitives) == null), "primitives already set");
    this.primitives = primitives;
    return this;
}