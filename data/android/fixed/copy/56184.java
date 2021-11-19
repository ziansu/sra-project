private void initTextfields() {
    javafx.scene.layout.VBox content = getTextfieldBox();
    initNameDescriptionFields(content);
    initCountTextfields(content);
    initPaddingTextfields(content);
    this.centerPane.getChildren().add(content);
}