private int getPageStart(int page) {
    if ((mStartPage) == page) {
        return 0;
    }else {
        return mPageDivider.get(((page - (mStartPage)) - 1));
    }
}