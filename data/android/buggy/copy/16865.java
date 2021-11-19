private javafx.scene.Scene createScene(javafx.scene.layout.Pane mainPane) {
    javafx.scene.Scene scene = new javafx.scene.Scene(mainPane);
    scene.getStylesheets().add(this.getClass().getResource("style/application.css").toExternalForm());
    return scene;
}