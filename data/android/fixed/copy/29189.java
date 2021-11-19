@org.testng.annotations.Test
public void testLimitWithMetadataQuery() {
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select expand(classes) from metadata:schema limit 3")).execute();
    assertEquals(qResult.size(), 3);
}