private float getCompareValue() {
    return (((this.isUserInterface() ? 999.0F : 0.0F) + (_sortingLayer)) + 0.95F) - (_innerSortingLayer);
}