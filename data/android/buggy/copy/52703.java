private void initializeFriendsearchResultPane() throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(ch.uzh.csg.p2p.screens.LoginWindow.class.getResource("FriendsearchResultPane.fxml"));
    loader.setController(mainWindowController);
    friendsearchResultPane = loader.load();
}