@org.testng.annotations.Test
public void testUseIndexWithOrderBy2() throws java.lang.Exception {
    long idxUsagesBefore = indexUsages(db);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> qResult = db.command(new com.orientechnologies.orient.core.sql.OCommandSQL("select * from foo where address.city = 'NY' order by name ASC")).execute();
    assertEquals(qResult.size(), 1);
}