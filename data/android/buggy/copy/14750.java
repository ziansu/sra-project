private void scrollWidthFixedWrongPosition(int position) {
    int pageWidth = mPager.getWidth();
    if (!(isScrollNormal)) {
        pageScroll((position - pageWidth));
    }else {
        pageScroll(position);
    }
}