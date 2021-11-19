public void stateChanged(javax.swing.event.ChangeEvent e) {
    model.currentTime = timeSlider.getValue();
    updateInfoLabels();
    mapPanel.repaint();
}