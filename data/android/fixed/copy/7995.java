@javafx.fxml.FXML
private void btnDeny_Click(javafx.event.ActionEvent event) {
    if ((selectedIncident) != null) {
        database.DatabaseManager.denyIncident(selectedIncident.getType(), selectedIncident.getLocation());
        instance.deleteIncident(selectedIncident);
    }
}