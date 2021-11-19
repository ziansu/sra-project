public void setRadii(byte radii) {
    byte before = this.radii;
    this.radii = radii;
    if (before != (this.radii)) {
        forceChunkLoading(null);
        forceChunkLoading(null);
    }
}