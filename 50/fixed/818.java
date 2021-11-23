@javafx.fxml.FXML
private void addTeam(javafx.event.ActionEvent event) {
    if (!(textFieldAddTeam.getText().isEmpty())) {
        listTeams.add(textFieldAddTeam.getText());
        textFieldAddTeam.clear();
    }
}