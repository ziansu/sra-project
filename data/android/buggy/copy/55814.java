@java.lang.Override
public void mouseMoved(final java.awt.event.MouseEvent e) {
    thisViewer.getGlobalMouseCoordinates(hoveredPoint);
    int hoveredIndex = this.selectedLandmark(hoveredArray, isMoving);
    thisViewer.setHoveredIndex(hoveredIndex);
}