public void setFloor(int floor) {
    this.currentFloor = floor;
    mapController.setFloor(floor);
    removeNodesAndLines();
    drawAllNodes();
}