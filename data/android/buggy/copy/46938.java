private synchronized void addUpdate(android.content.ContentProviderOperation update) {
    mDataUpdateList.add(update);
    if ((mDataUpdateList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
        update(mDataUpdateList);
    }
}