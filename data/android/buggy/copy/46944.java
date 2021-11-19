private boolean haveNext() throws java.io.IOException, java.sql.SQLException {
    boolean haveNext = resultSet.next();
    if (haveNext) {
        (result.totalCount)++;
        currentRecord = getConverter().convertToAvro(resultSet);
    }
    return haveNext;
}