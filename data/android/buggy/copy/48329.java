public void addItems(int position, java.util.List<com.crux.ListItem> items) {
    mItems.addAll(position, items);
    initializeItemsWithType();
}