private void initTextFields() {
    javafx.scene.layout.VBox content = getTextfieldBox();
    initNameDescriptionFields(content);
    initCountTextfields(content);
    initInstrumentsDropdown(content, instruments);
    this.centerPane.getChildren().add(content);
}