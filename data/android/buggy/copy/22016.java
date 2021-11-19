public android.database.Cursor getCursor() {
    java.lang.System.out.println(("GET CURSOR: " + (mCursor.getColumnCount())));
    return mCursor;
}