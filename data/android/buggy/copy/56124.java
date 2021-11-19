@javafx.fxml.FXML
private void initialize() {
    de.fhl.enca.controller.Initialize.initialize();
    usernameLabel.setText(de.fhl.enca.bl.User.getName());
}