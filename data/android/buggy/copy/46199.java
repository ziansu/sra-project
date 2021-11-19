public void setEmptyView(android.view.View emptyView) {
    mEmptyView = emptyView;
    addView(mEmptyView, new com.dexafree.materialList.view.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    checkIfEmpty();
}