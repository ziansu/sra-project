public void commit() throws de.jottyfan.postdbm.PostDBMException {
    try {
        connection.commit();
        connection.close();
    } catch (java.sql.SQLException e) {
        throw new de.jottyfan.postdbm.PostDBMException(e);
    }
}