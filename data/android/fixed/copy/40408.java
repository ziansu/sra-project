public void setMenuItem(android.view.MenuItem menuItem) {
    this.menuItem = menuItem;
    menuItem.setActionView(imageView);
    if (startAnimation) {
        startAnimation();
    }
}