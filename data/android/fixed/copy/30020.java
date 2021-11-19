public boolean loadList(javax.swing.JFrame farame, javax.swing.DefaultListModel<java.lang.String> listModel) {
    if ((myJFileChooser.showOpenDialog(farame)) == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        return loadList(myJFileChooser.getSelectedFile(), listModel);
    }
    return false;
}