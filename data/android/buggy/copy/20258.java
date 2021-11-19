public void moveToSelected() {
    setDirection(selectedRange.getX(), selectedRange.getY());
    setPosition(selectedRange.getX(), selectedRange.getY());
    clearRange();
}