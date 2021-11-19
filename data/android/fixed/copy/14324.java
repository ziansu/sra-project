@java.lang.Override
public java.lang.String readKey(android.database.Cursor cursor, int offset) {
    return cursor.isNull((offset + 1)) ? null : cursor.getString((offset + 1));
}