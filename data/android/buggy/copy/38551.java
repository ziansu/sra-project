@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e, java.awt.Point imageLocation) {
    if ((!(hasSelection())) && (hasSelectionBounds())) {
        completeSelection(imageLocation);
        getSelectionFromCanvas();
    }
}