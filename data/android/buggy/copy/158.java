@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        listener.doubleClicked(lastItem.getId());
    }
}