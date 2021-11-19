public org.openstreetmap.josm.plugins.mapillary.MapillarySequence getSequence() {
    if ((sequence) == null) {
        sequence = new org.openstreetmap.josm.plugins.mapillary.MapillarySequence();
        sequence.add(this);
    }
    return this.sequence;
}