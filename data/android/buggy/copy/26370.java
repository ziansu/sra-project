@java.lang.Override
public void handle(javafx.event.ActionEvent actionEvent) {
    addSample();
    if ((com.piscope.PiController.customCall) == true) {
        toggleAdd();
        autoZoom();
    }
}