@org.develnext.jphp.ext.javafx.classes.Signature
public void showAndWait() {
    if (!(getWrappedObject().isShowing())) {
        fixResizeBug();
        javafx.application.Platform.runLater(this::fixResizeBug);
        getWrappedObject().showAndWait();
    }
}