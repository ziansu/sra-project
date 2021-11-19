public void backToHome(javafx.event.ActionEvent event) {
    try {
        new appLibrarian.view.HomeWindow(appLibrarian.view.CreateReaderWindow.ctrl).show();
    } catch (java.io.IOException e) {
        appLibrarian.Util.showError(Util.Err.UNKNOWN);
        return ;
    }
    this.hide();
}