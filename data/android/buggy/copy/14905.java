public void setCurrentPage(int page) {
    int currentItem = mPager.getCurrentItem();
    if (page != currentItem) {
        getCurrentFragment().saveData();
        mPager.setCurrentItem(page);
    }
}