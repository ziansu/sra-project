@javafx.fxml.FXML
private void handleMainMenuButton(javafx.event.ActionEvent event) {
    utility.GameLog.addInfoLog("Retry button pressed from you lost screen");
    java.lang.System.out.println("Retry button pressed!");
    popupControl.hide();
    nl.joshuaslik.tudelft.SEM.control.viewController.MainMenuController.loadView();
}