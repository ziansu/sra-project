public int getScrollableUnitIncrement(java.awt.Rectangle visibleRect, int orientation, int direction) {
    java.awt.Dimension prefSize = layout.preferredLayoutSize(this);
    return prefSize.height;
}