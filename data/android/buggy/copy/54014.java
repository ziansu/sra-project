public static de.struckmeierfliesen.ds.micromanagement.Food cursorToFood(android.database.Cursor cursor, int type) {
    return de.struckmeierfliesen.ds.micromanagement.sqlite.DatabaseConnection.cursorToFood(cursor, type, true);
}