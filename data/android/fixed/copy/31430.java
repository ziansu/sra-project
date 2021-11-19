@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    setCurrentLayer(layerJList.getSelectedIndex());
    if ((canvasPanel) != null) {
        repaint();
    }
    selectedObjects.clear();
}