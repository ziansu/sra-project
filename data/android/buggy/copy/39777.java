@java.lang.Override
public void sync() {
    this.guiElementField.setColumns(getSize());
    this.guiElementText.setText(((getName()) + ": "));
}