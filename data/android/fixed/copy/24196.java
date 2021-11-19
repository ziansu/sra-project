@javafx.fxml.FXML
public void handleGermanButton() {
    if (isGerman) {
        changeLang("en", "US");
        isGerman = false;
    }else {
        changeLang("de", "DE");
        isGerman = true;
    }
}