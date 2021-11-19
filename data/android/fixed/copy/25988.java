private void deleteAllDataFromDB() {
    mDB.execSQL((("DELETE FROM " + (net.c_kogyo.returnvisitorv5.db.RVDBContract.TABLE_NAME)) + ";"));
}