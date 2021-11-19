@javafx.fxml.FXML
private void onClickDeleteButton(javafx.event.ActionEvent event) {
    hu.unideb.inf.estran.ep.view.Controller.projects.remove(actualListMember);
    actualListMember = -1;
    clearGUI();
}