public void deleteTask(int count) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(("DELETE from TASKS WHERE ID == " + count));
}