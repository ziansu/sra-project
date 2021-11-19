@java.lang.Override
public void sync() {
    this.text = this.guiElementField.getText();
    this.guiElementField.setColumns(getSize());
    this.guiElementText.setText(((getName()) + ": "));
}