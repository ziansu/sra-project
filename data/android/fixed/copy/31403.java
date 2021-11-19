@javafx.fxml.FXML
private void onClickDeleteButton(javafx.event.ActionEvent event) {
    if ((actualListMember) != (-1)) {
        hu.unideb.inf.estran.ep.view.Controller.projects.remove(actualListMember);
        actualListMember = -1;
        clearGUI();
    }
}