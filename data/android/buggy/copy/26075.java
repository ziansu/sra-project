@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    java.lang.System.out.println("Initialized");
    gc = canvas.getGraphicsContext2D();
    gc.setFill(javafx.scene.paint.Color.BLACK);
    gc.fill();
    gc.setStroke(javafx.scene.paint.Color.BLACK);
}