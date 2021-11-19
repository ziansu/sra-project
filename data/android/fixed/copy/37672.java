@javafx.fxml.FXML
public void addPair() {
    java.lang.String namePair = pairTextField.getText();
    addClass(namePair);
    addTest(namePair);
    pairTextField.clear();
}