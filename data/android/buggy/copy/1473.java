@javafx.fxml.FXML
public void onSave() {
    de.hamsterhobel.rest.ui.RestQueryUI.log.debug("Save triggered");
    runner.execute(() -> save());
}