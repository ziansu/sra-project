public void setFiled(vision.models.Filed filed) {
    this.field = filed;
    javafx.application.Platform.runLater(() -> editorId.setHtmlText(filed.getParsed()));
}