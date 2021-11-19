private void refreshListView() throws java.io.IOException {
    javafx.collections.ObservableList<java.lang.String> myCloudFiles = javafx.collections.FXCollections.observableArrayList(myCloudFiles());
    for (java.lang.String string : myCloudFiles) {
        java.lang.System.out.println(string);
    }
    myCloudFilesList.setItems(myCloudFiles);
}