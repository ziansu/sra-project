@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    gui.OfferInfoDialog dialog = new gui.OfferInfoDialog(parentFrame);
    dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    dialog.setLocationRelativeTo(parentFrame);
    dialog.setVisible(true);
}