private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {
    horaireController.moveActivite(evt.getPoint());
    updateLogMessage(evt);
    drawingPanel.repaint();
}