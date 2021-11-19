@java.lang.Override
public void startEdit() {
    super.startEdit();
    if ((textField) == null) {
        createTextField();
    }
    setText(null);
    setGraphic(textField);
    textField.selectAll();
}