protected me.gujun.android.taggroup.TagGroup.TagView getLastNormalTagView() {
    final int lastNormalTagIndex = (isAppendMode) ? (getChildCount()) - 2 : (getChildCount()) - 1;
    me.gujun.android.taggroup.TagGroup.TagView lastNormalTagView = getTagAt(lastNormalTagIndex);
    return lastNormalTagView;
}