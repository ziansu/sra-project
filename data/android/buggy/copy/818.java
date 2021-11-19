@javafx.fxml.FXML
private void addTeam(javafx.event.ActionEvent event) {
    listTeams.add(textFieldAddTeam.getText());
    textFieldAddTeam.clear();
}