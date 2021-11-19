private void toggleButtonPressed(javafx.scene.control.ToggleButton pressed, javafx.scene.control.ToggleButton other) {
    other.setDisable(pressed.isSelected());
    setFieldsDisabled(pressed.isSelected(), pressed.getUserData().toString());
    fireTestUnitEvent(pressed);
}