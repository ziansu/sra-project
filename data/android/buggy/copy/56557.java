@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    mAccountsDbAdapter.deleteAllRecords();
    mDbHelper.close();
    mDb.close();
    mSolo.finishOpenedActivities();
    super.tearDown();
}