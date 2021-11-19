private void RunButtonActionPerformed(java.awt.event.ActionEvent evt) {
    sicasm.SicASM.run(SRCText.getText());
    Tabs.setSelectedIndex(1);
    ObjectPanel.setVisible(true);
    ObjectPanel.show(true);
}