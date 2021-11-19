public void setIsShowBorder(boolean isShow) {
    mIsShowBorder = isShow;
    if (!(mIsShowBorder)) {
        mFrameBorderWidth = 0;
        mHeaderBorderWidth = 0;
        mUnitBorderWidth = 0;
    }
}