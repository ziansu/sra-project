@javafx.fxml.FXML
private void loadMyApps() {
    javafx.collections.ObservableList<Main_Project.MyAppEntry> populateTable = getPopTable();
    myAppList.setItems(populateTable);
}