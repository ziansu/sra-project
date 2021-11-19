@javafx.fxml.FXML
private void plzChange() {
    if ((cbProjektPlz.getSelectionModel().getSelectedItem()) != null) {
        lblProjektOrt.setText(cbProjektPlz.getSelectionModel().getSelectedItem().getOrt());
    }
}