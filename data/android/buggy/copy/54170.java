private void setOffsetTopAndBottom(int offset) {
    mLayoutOffsetTop = (mHeaderViewHeight) + (getCurTop());
    mRefreshHeaderView.offsetTopAndBottom(offset);
    mRefreshView.offsetTopAndBottom(offset);
    invalidate();
}