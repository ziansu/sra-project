@javafx.fxml.FXML
public void handleGermanButton() {
    if (isGerman) {
        changeLang("en", "US");
    }else {
        changeLang("de", "DE");
    }
}