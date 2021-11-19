public java.sql.Statement getStatement() throws java.sql.SQLException {
    checkOpen();
    return this.statement;
}