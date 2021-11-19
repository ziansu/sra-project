@javafx.fxml.FXML
private void changePassword() {
    controller.PasswordChangerController.getInstance().initStage();
    controller.PasswordChangerController.getInstance().getStage().show();
}