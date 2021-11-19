@javafx.fxml.FXML
private void handleSave() {
    if (this.isInputValid()) {
        aUser = updateUser(aUser);
        database.MySQLdb.updateUser(aUser);
        app.showMainPage();
    }
}