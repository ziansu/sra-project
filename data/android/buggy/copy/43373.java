public org.openstreetmap.josm.data.validation.TestError.Builder highlight(java.util.Collection<? extends org.openstreetmap.josm.data.osm.OsmPrimitive> highlighted) {
    org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.highlighted) == null), "highlighted already set");
    this.highlighted = highlighted;
    return this;
}