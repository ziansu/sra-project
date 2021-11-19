public void removeAll() {
    openRead();
    mDb.delete(DataBaseHelper.TABLE_NEEDS, null, null);
    mDb.delete(DataBaseHelper.TABLE_INTERNATS, null, null);
    mDb.delete(DataBaseHelper.TABLE_PHONES, null, null);
}