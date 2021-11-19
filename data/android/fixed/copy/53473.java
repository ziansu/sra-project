private void addButtonToControlPanel(javax.swing.JButton button, java.lang.String label) {
    button.setActionCommand(label);
    button.addActionListener(this);
    controlPanel.add(button);
}