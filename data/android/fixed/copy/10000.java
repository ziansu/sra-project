private synchronized void addInsert(android.content.ContentValues insert) {
    if ((mDataInsertList) != null) {
        mDataInsertList.add(insert);
        if ((mDataInsertList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
            insert(mDataInsertList);
        }
    }
}