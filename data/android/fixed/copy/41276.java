public void setClickable(boolean clickable) {
    this.isClickable = clickable;
    if (this.isDebug) {
        this.inValidate();
    }
}