@javafx.fxml.FXML
private void onProductSelected(javafx.event.ActionEvent event) {
    nettoPrice.setText(java.lang.Float.toString(products.getValue().getPrice()));
}