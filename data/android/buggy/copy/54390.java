public boolean existsLayer(java.lang.String workspace, java.lang.String name) {
    return existsLayerGroup(workspace, name, Util.DEFAULT_QUIET_ON_NOT_FOUND);
}