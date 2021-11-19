public void setClickable(boolean clickable) {
    this.isClickable = clickable;
    if ((this.isDebug) == true) {
        this.inValidate();
    }
}