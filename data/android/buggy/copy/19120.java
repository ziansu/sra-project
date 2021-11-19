@java.lang.Override
public void setRatioOfHeaderHeightToHintTwoLevelRefresh(float ratio) {
    mRatioOfHeaderHeightToHintTwoLevelRefresh = ratio;
    mOffsetToHintTwoLevelRefresh = ((int) (java.lang.Math.ceil(((mHeaderHeight) * ratio))));
}