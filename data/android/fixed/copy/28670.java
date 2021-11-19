private void tappedSaveButton() {
    java.io.File file = this.getMenuView().showSaveDialog(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    this.getMenuModel().save(file);
    return ;
}