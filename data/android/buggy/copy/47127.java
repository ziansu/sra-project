@java.lang.Override
public void handle(javafx.scene.input.MouseEvent drag) {
    if (root.imageHasBeenSelected()) {
        double x = drag.getX();
        double y = drag.getY();
        root.moveSelectedImageToCurrentXY(x, y);
    }
}