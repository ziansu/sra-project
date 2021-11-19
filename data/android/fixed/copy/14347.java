public void setOffset(int offset) {
    if ((centerView) != null) {
        offsetChildren(null, (offset - (centerView.getLeft())));
    }
}