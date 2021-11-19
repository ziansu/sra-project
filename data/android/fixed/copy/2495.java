private void lstLocationTypeLocationTypePanelValueChanged(javax.swing.event.ListSelectionEvent evt) {
    LTCleanText();
    NewLocationType = LTPSelectedLocationType();
    if ((NewLocationType) != null) {
        txtNameLocationTypePanel.setText(NewLocationType.getName());
    }
}