@java.lang.Override
public void setIsHaveMore(boolean isHasMore) {
    this.isHasMore = isHasMore;
    if ((mWrapAdapter) != null) {
        mWrapAdapter.notifyDataSetChanged();
    }
}