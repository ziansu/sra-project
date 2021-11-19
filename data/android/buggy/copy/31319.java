@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    if (org.odk.collect.android.database.FormRelationsDb.LOCAL_LOG) {
        android.util.Log.d(org.odk.collect.android.database.FormRelationsDb.TAG, "onCreate. Created relations table.");
    }
    db.execSQL(FormRelations.CREATE_TABLE);
}