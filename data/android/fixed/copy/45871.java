public void destructiveSaveDirectory(entities.Directory dir) throws main.DatabaseException {
    this.reInitSchema();
    try {
        this.saveDirectory(dir);
    } catch (java.sql.SQLException e) {
        throw new main.DatabaseException("Failed to update database; database may be corrupt", e);
    }
}