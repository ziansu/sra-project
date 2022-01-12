public int getNchannels() {
    return hasDimensions() ? this.dimensions[4] : 0;
}