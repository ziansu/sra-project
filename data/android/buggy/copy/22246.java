public void updateItems(boolean animated) {
    animateItems = animated;
    fillLikesWithRandomValues();
    notifyDataSetChanged();
}