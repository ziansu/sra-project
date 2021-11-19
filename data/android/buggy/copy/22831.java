@java.lang.Override
public novoda.lib.sqliteprovider.util.Constraint parseRow(android.database.Cursor cursor) {
    int isUnique = cursor.getInt(2);
    if (isUnique == 1) {
        java.lang.String indexName = cursor.getString(1);
        return getConstraintFromIndex(indexName);
    }
}