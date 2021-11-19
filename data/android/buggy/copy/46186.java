public void destroyVisualization() {
    if ((cubesGroup) != null) {
        cubesGroup.detach();
    }
    this.hideAllClusters();
}