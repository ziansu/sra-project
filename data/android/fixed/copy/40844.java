public java.lang.String getCursorName() throws java.sql.SQLException {
    checkOpen();
    if ((cursorName) != null) {
        return cursorName;
    }
    throw new java.sql.SQLException(net.sourceforge.jtds.jdbc.Messages.get("error.resultset.noposupdate"), "24000");
}