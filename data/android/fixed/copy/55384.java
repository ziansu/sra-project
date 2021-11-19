protected void clearWidget() {
    if ((widget) != null) {
        widget.removeFromParent();
        widget = null;
    }
    destroyChildren();
}