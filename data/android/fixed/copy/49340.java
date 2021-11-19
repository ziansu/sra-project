@butterknife.OnClick(value = R.id.scroll_left_button)
protected void scrollLeft() {
    if (!(mCustomScrollView.isScrolling())) {
        mCustomScrollView.scrollBy((-1));
    }
}