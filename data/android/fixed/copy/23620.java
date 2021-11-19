@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_LUMINARIAS_TABLE = context.getString(R.string.create_table_luminarias);
    db.execSQL(CREATE_LUMINARIAS_TABLE);
    java.lang.String CREATE_IMAGENES_TABLE = context.getString(R.string.create_table_imagenes);
    db.execSQL(CREATE_IMAGENES_TABLE);
}