private void init() {
    db = new com.ngngteam.pocketwallet.Data.MoneyDatabase(this);
    c = db.getExpensesFromNewestToOldest();
    startManagingCursor(c);
    adapter = new com.ngngteam.pocketwallet.Adapters.HistoryListViewAdapter(this, c);
}