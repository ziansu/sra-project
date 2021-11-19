@java.lang.Override
public void handle(javafx.scene.input.MouseEvent mouseEvent) {
    if ((mouseEvent.getClickCount()) == 2) {
        treeView.getSelectionModel().clearSelection();
    }
}