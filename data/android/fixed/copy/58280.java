public com.sst.anouncements.DbAdapter open() throws android.database.SQLException {
    this.dbHelper = new com.sst.anouncements.DbAdapter.DbHelper(this.context);
    this.SQLdb = this.dbHelper.getWritableDatabase();
    return this;
}