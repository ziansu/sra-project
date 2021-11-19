private void onItemDisappeared(int sourceIndex) {
    int index = disappearItem(sourceIndex);
    if (index >= 0) {
        registry.notifyRemoved(this, index, 1);
    }
}