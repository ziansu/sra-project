protected void finalize() throws java.lang.Throwable {
    if (bUpdateDB) {
        setDBFieldData();
    }
    super.finalize();
}