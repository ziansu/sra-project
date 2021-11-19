@butterknife.OnClick(value = R.id.scroll_right_button)
protected void scrollRight() {
    if (mCustomScrollView.isScrolling()) {
        mCustomScrollView.stopScroll();
    }
    mCustomScrollView.scrollBy(1);
}