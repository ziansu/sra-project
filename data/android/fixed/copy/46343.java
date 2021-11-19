private void addQueueItem(hudson.model.Queue.Item item) {
    jenkins.widgets.HistoryPageEntry<hudson.model.Queue.Item> entry = new jenkins.widgets.HistoryPageEntry(item);
    queueItems.add(entry);
    updateNewestOldest(entry.getEntryId());
}