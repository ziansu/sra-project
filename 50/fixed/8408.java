public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    clearExerciseTable(db);
}