protected void finalize() throws java.lang.Throwable {
    if (bUpdateDB) {
        setDBFieldData(tableName, colName, data);
    }
    super.finalize();
}