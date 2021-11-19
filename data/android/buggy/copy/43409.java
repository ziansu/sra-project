public java.util.List<T> animateTo(java.util.List<T> models) {
    applyAndAnimateRemovals(mItems, models);
    applyAndAnimateMovedItems(mItems, models);
    applyAndAnimateAdditions(mItems, models);
    return mItems;
}