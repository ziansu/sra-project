public static void main(java.lang.String[] args) {
    shownotes.UpdateHandler updatehandler = new shownotes.UpdateHandler();
    updatehandler.doUpdate();
    shownotes.SetupDialog setupDialog = new shownotes.SetupDialog(new java.awt.Dimension(300, 340));
}