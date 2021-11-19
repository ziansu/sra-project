private void layerListValueChanged(javax.swing.event.ListSelectionEvent evt) {
    if (!(evt.getValueIsAdjusting())) {
        writeGUI();
        reloadHTMLPreviewMap();
    }
}