@org.junit.After
public void deleteSQLDBObject() {
    mDB1.close();
    android.content.Context ctx = android.support.test.InstrumentationRegistry.getTargetContext();
}