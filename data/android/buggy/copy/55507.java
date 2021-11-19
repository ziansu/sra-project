public void openFehlermeldungDialog(java.lang.String fehlermeldung, gui.MainFrame mainFrame) {
    javax.swing.JOptionPane fehlerFenster = new javax.swing.JOptionPane();
    fehlerFenster.showMessageDialog(mainFrame, fehlermeldung, "Fehler!", javax.swing.JOptionPane.ERROR_MESSAGE);
}