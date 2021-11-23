public void setBackgroundColor(int bgColor) {
    this.mBackgroundColor = bgColor;
    super.setBackgroundColor(this.mBackgroundColor);
    invalidate();
}