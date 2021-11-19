public boolean updateSubscribed(int eventID, int subscribed) {
    long updated = mDataHelper.updateSubscribed(eventID, subscribed);
    mDataSetChanged = true;
    syncData();
    return updated != (-1);
}