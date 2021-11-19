public int getMapHeight() {
    int height = currentMap.getProperties().get("height", java.lang.Integer.class);
    return height;
}