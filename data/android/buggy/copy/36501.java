@javafx.fxml.FXML
public void initialize() {
    initControllers();
    loadListsInTabs();
    cleanCompletedTasks();
    cleanEmptyCategories();
    initTutorialPopup();
    selectionModel = bodyController.tPaneMain.getSelectionModel();
    application.Execution.executeStatusCheckTimerTask();
}