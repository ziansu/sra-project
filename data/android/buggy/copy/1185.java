public void changeCursor(android.database.Cursor c) {
    if ((cursor) != null)
        c.close();
    
    cursor = c;
    notifyDataSetChanged();
}