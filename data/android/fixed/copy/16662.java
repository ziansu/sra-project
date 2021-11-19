public void setFloor(int floor) {
    mapController.setFloor(floor);
    removeNodesAndLines();
    drawAllNodes();
}