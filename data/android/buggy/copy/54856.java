public void initialize() {
    hideAllSubViews();
    makeViewVisible("Demo");
    reloadUsers();
    cbUsers.getSelectionModel().selectFirst();
    userSelectionChanged();
}