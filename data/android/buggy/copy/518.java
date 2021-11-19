private void goToLastPos() {
    this.setText(this.getText());
    this.positionCaret(this.getLength());
    currentPosInLine = charCounterInLine;
}