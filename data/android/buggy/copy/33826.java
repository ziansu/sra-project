@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setCurrentRegion(jComboBox1.getSelectedItem().toString());
    populateServicesLabels();
    interruptThreads();
    if (jToggleButton1.isSelected()) {
        regionChanged = true;
    }
}