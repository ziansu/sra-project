@javafx.fxml.FXML
private void onLogin() {
    loginListener.onLogin(txtServer.getText(), txtUsername.getText());
}