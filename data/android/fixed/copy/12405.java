public void swapCursor(android.database.Cursor cursor) {
    if ((mCursor) == cursor)
        return ;
    
    this.mCursor = cursor;
    notifyDataSetChanged();
}