public org.rstudio.core.client.events.MouseDragHandler.MouseCoordinates getMouseDelta() {
    return new org.rstudio.core.client.events.MouseDragHandler.MouseCoordinates(((event_.getClientX()) - (lastCoordinates_.getMouseX())), ((event_.getClientY()) - (lastCoordinates_.getMouseY())));
}