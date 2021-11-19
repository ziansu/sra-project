public boolean covers(double position) {
    return ((this.getMinCoverage()) <= position) && ((this.getMaxCoverage()) >= position);
}