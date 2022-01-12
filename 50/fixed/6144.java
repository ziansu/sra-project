public float getTileScale() {
    return mapScaleResolver.getTileSize(owner.getScreenWidth(), owner.getScreenHeight(), map.width, map.height);
}