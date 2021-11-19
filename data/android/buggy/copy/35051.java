@java.lang.Override
public void onResume() {
    super.onResume();
    android.database.sqlite.SQLiteDatabase rdb = db.getReadableDatabase();
    studentList = db.fetchAllData();
    new com.example.pustikom.adapterplay.StudentActivity.DataSyncTask().execute(studentList);
}