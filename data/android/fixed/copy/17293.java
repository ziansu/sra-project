public void setDragToRotate(boolean dragToRotate) {
    this.dragToRotate = dragToRotate;
    this.canRotate = !dragToRotate;
    if ((inputManager) != null) {
        inputManager.setCursorVisible(dragToRotate);
    }
}