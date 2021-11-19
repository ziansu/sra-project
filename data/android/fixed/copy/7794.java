@java.lang.Override
public void close() throws java.sql.SQLException {
    result = null;
    row = -1;
    isClosed = true;
    currentRow = null;
}