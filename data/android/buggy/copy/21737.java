public void actionPerformed(java.awt.event.ActionEvent e) {
    new javax.swing.JColorChooser();
    java.awt.Color newColor = javax.swing.JColorChooser.showDialog(null, "Paint Color", java.awt.Color.WHITE);
    color = newColor;
    m.fgColor = newColor;
}