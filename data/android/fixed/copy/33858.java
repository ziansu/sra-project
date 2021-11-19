private java.lang.String getText(int id) {
    try {
        return clippy.db.getThreadConnection().getText(id);
    } catch (java.sql.SQLException ex) {
        if (com.esotericsoftware.minlog.Log.Log.ERROR)
            error("Unable to retrieve full text.", ex);
        
        return "";
    }
}