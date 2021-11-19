@java.lang.Override
protected boolean validate() {
    return (((typeBox) != null) && ((typeBox.getValue()) != null)) && (!(typeBox.getValue().isEmpty()));
}