@java.lang.Override
public void setVisible(boolean makeVisible) {
    this.hiddenDialog.setVisible(makeVisible);
    this.hiddenDialog.setEnabled(false);
    this.hiddenDialog.setUndecorated(true);
    super.setVisible(makeVisible);
}