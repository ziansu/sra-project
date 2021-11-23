public void focusLost() {
    if (isInFocus) {
        this.isInFocus = false;
        this.app.focusLost(this);
    }
}