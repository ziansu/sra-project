@javafx.fxml.FXML
public void level2Pressed() {
    populateObservableList(2);
    buttonClicked(Button2);
    java.lang.String outputText = _statistics.printStatistics(2);
}