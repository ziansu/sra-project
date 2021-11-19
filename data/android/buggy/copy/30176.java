@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    if ((event.getCode()) == (javafx.scene.input.KeyCode.CONTROL)) {
        gov.va.isaac.gui.conceptViews.helpers.ConceptViewerTooltipHelper.controlKeyPressed = true;
    }
    if ((event.getCode()) == (javafx.scene.input.KeyCode.SHIFT)) {
        gov.va.isaac.gui.conceptViews.helpers.ConceptViewerTooltipHelper.shiftKeyPressed = true;
    }
}