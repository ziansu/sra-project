public int getAncestorVerticalMargin() {
    return ((mParent) != null ? mParent.getAncestorVerticalMargin() : 0) + (getVerticalMargin());
}