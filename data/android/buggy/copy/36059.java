@java.lang.Override
public void addItemsToCache(java.util.List<com.denisenko.alexey.simple.reddit.client.top.TopEntry> topEntries) {
    inMemoryRepository.addEntries(topEntries);
    if ((inMemoryRepository.getEntries().size()) == (com.denisenko.alexey.simple.reddit.client.top.mvp.TopListModel.MAXIMUM_ITEMS_COUNT)) {
        presenter.stopPagination();
    }
}