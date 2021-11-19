@javafx.fxml.FXML
protected void gotoConfig2(javafx.event.ActionEvent event) throws java.lang.Exception {
    saveSettings(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    LoadSceneXml("/fxml/config2.fxml");
    dpfmanager.MainApp.gui.loadRules(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
}