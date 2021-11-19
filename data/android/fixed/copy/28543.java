private void refreshListView() throws java.io.IOException {
    javafx.collections.ObservableList<java.lang.String> myCloudFiles = javafx.collections.FXCollections.observableArrayList(myCloudFiles());
    myCloudFilesList.setItems(myCloudFiles);
}