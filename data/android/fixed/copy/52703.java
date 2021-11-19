private void initializeFriendsearchResultPane() throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("FriendsearchResultPane.fxml"));
    loader.setController(mainWindowController);
    friendsearchResultPane = loader.load();
}