public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    mapChooser.Map map = new mapChooser.Map();
    primaryStage = getMapView(map);
    primaryStage.show();
}