public void setFiled(vision.models.Filed filed) {
    this.field = filed;
    vision.controllers.ExploreDataController.logger.info(filed.getParsed());
    javafx.application.Platform.runLater(() -> editorId.setHtmlText(filed.getParsed()));
}