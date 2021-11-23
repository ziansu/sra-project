@javafx.fxml.FXML
public void nextButtonWasPressed() {
    imat.viewcontroller.ConfirmationViewController cvc = imat.viewcontroller.ConfirmationViewController.load("ConfirmationView.fxml");
    imat.viewcontroller.RootViewController.getInstance().setContent(cvc);
}