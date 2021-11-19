@javafx.fxml.FXML
void downPressed() {
    i = java.lang.Integer.parseInt(units.getText());
    if ((i) > 1) {
        (i)--;
        units.setText(((i) + ""));
    }
}