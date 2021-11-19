public org.openstreetmap.josm.plugins.mapillary.MapillarySequence getSequence() {
    if ((this.sequence) == null) {
        this.sequence = new org.openstreetmap.josm.plugins.mapillary.MapillarySequence();
        this.sequence.add(this);
    }
    return this.sequence;
}