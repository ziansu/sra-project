@javafx.fxml.FXML
private void handleSave() {
    if (this.isInputValid()) {
        aUser = updateUser(aUser);
        database.MySQLdb.updateUser(aUser);
        services.UserDatabaseInterface.editUser(aUser);
        app.showMainPage();
    }
}