@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.showOpenDialog(null);
    java.io.File f = chooser.getSelectedFile();
    java.lang.String filename = f.getAbsolutePath();
    imageFileButton.setText(filename);
}