private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {
    horaireController.moveActivite(horaireController.verificationDrop(evt.getPoint()));
    updateLogMessage(evt);
    drawingPanel.repaint();
}