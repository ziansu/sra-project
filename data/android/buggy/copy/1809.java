public void addItem(com.crux.ListItem item, int position) {
    if (com.crux.util.CollectionUtils.isEmpty(mItems)) {
        return ;
    }
    mItems.add(position, item);
    initializeItemsWithType();
}