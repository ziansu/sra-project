public synchronized void deleteHistoryItem(java.lang.String url) {
    mLock = true;
    openIfNecessary();
    mDatabase.delete(com.jtechme.jumpgokids.database.HistoryDatabase.TABLE_HISTORY, ((com.jtechme.jumpgokids.database.HistoryDatabase.KEY_URL) + " = ?"), new java.lang.String[]{ url });
    mLock = false;
}