public com.stratio.crossdata.common.data.DataStoreName createTestDatastore() {
    final java.lang.String DATASTORE_NAME = "dataStoreTest";
    com.stratio.crossdata.common.data.DataStoreName dataStoreName = new com.stratio.crossdata.common.data.DataStoreName(DATASTORE_NAME);
    insertDataStore(DATASTORE_NAME, "production");
    return dataStoreName;
}