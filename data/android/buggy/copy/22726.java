public void addVertex(int x, int y) {
    vertexPoints.add(new java.awt.Point(board.camera.getLocalX(worldGeomMousePos.x), board.camera.getLocalY(worldGeomMousePos.y)));
    updateSurfaceLines();
}