@org.junit.Before
public void createSQLDBObject() {
    ctx = android.support.test.InstrumentationRegistry.getTargetContext();
    mDB1 = new com.example.boba.lookapplication.DB1(ctx, com.example.boba.lookapplication.TestSQLLiteDB.TEST_NAME_DB);
}