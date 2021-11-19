private java.lang.String getText(int id) {
    try {
        com.esotericsoftware.clippy.ClipDataStore.ClipConnection conn = clippy.db.getThreadConnection();
        return conn.getText(id);
    } catch (java.sql.SQLException ex) {
        if (com.esotericsoftware.minlog.Log.Log.ERROR)
            error("Unable to retrieve full text.", ex);
        
        return "";
    }
}