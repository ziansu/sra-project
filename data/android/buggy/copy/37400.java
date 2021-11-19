public java.lang.String getClientText() {
    java.lang.String text = this.codeArea.getText();
    this.mergeChanges = !(this.isEnum(text));
    return text;
}