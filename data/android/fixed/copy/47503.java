@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    db.close();
    dbHelper.close();
}