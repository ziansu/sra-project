@java.lang.Override
public void cancelEdit() {
    super.cancelEdit();
    this.alignText(getItem().toString());
    this.setGraphic(null);
}