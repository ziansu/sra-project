@javafx.fxml.FXML
private void changePassword() {
    if ((controller.PasswordChangerController.getInstance().getStage()) == null)
        controller.PasswordChangerController.getInstance().initStage();
    
    controller.PasswordChangerController.getInstance().getStage().show();
}