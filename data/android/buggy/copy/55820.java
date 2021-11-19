public void finish() {
    spaceInfo.updateMap(mapIndex, map);
    spaceInfo.saveAllMaps();
    environment.destroy();
}