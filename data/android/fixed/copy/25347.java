@javafx.fxml.FXML
private void handleSearchAction(javafx.event.ActionEvent event) throws java.io.IOException, java.lang.InterruptedException {
    application.SearchThread st = new application.SearchThread(getSearchField, songLabelText, albumArt, loadingImage, false);
    st.start();
}