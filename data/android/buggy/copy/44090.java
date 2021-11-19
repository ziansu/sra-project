public void addUserScoreTable(javafx.collections.ObservableList<JavaFXLogoQuiz.FXMLControllerScore.UserScore> data, javafx.scene.control.TableView tableView, boolean buttonPress) {
    setCellValueFactoryUserScoreTable(buttonPress);
    tableView.setItems(data);
}