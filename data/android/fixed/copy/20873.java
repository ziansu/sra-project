protected me.gujun.android.taggroup.TagGroup.TagView getLastNormalTagView() {
    final int lastNormalTagIndex = (isAppendMode) ? (getChildCount()) - 2 : (getChildCount()) - 1;
    return getTagAt(lastNormalTagIndex);
}