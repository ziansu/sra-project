public graphics.IGraphics getGraphics() {
    graphics.GraphicsCollection mapGraphics = new graphics.GraphicsCollection();
    mapGraphics.add(map.getGraphics());
    mapGraphics.add(entities.getGraphics());
    return mapGraphics;
}