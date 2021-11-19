private void removeSetItem(NestedSetItem<T> setItem) {
    if (this.remove(setItem)) {
        setItem.removeContainingSet(this);
        removeFromChildren(setItem);
    }
}