public void setMouseHandling(final javafx.scene.Node node) {
    node.setOnMousePressed(onMousePressedEventHandler);
    node.setOnMouseEntered(onMouseEnteredEventHandler);
    node.setOnMouseDragged(onMouseDraggedEventHandler);
    node.setOnDragDetected(onMouseDraggedEventHandler);
}