@java.lang.Override
public void setFooterHeight(int height) {
    mFooterHeight = height;
    mOffsetToLoadMore = ((int) (java.lang.Math.ceil(((mRatioOfFooterHeightToLoadMore) * (mFooterHeight)))));
}