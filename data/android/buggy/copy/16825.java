protected final void setScrollRightBack(boolean flag) {
    if ((this.isScrollRightBack) != flag) {
        this.contentLayout.setOnTouchListener((flag ? this : null));
        this.isScrollRightBack = flag;
    }
}