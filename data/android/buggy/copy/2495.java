private void lstLocationTypeLocationTypePanelValueChanged(javax.swing.event.ListSelectionEvent evt) {
    LTCleanText();
    NewLocationType = LTPSelectedLocationType();
    txtNameLocationTypePanel.setText(NewLocationType.getName());
}