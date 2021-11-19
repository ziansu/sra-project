@javafx.fxml.FXML
private void initialize() {
    group_1 = new javafx.scene.control.ToggleGroup();
    count_up.setToggleGroup(group_1);
    count_down.setToggleGroup(group_1);
    addFocusListener(sec_field);
    addFocusListener(min_field);
    addFocusListener(hr_field);
}