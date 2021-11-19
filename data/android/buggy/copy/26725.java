@javafx.fxml.FXML
private void handleMB(javafx.event.ActionEvent event) {
    motherBoardButton.setText("esto si va");
    controllers.ConfigurationViewController.initializeListView(es.upv.inf.Product.Category.MOTHERBOARD);
}