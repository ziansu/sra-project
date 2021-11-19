private javafx.scene.control.ScrollPane createScrollPane() {
    javafx.scene.control.ScrollPane scrollPane = new javafx.scene.control.ScrollPane();
    scrollPane.setStyle("-fx-background: #CCCCCC;");
    scrollPane.setContent(createPDFPane());
    return scrollPane;
}