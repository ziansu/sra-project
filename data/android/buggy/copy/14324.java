@java.lang.Override
public java.lang.Long readKey(android.database.Cursor cursor, int offset) {
    return cursor.isNull((offset + 0)) ? null : cursor.getLong((offset + 0));
}