protected void addCursorRow(android.database.MatrixCursor cursor, jp.redmine.redmineclient.entity.IMasterRecord changes, int id, int title_id) {
    if (changes == null)
        return ;
    
    cursor.addRow(new java.lang.Object[]{ id , title_id , null , changes.getName() });
}