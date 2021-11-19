@java.lang.Override
protected void onDestroy() {
    db.close();
    dbHelper.close();
    super.onDestroy();
}