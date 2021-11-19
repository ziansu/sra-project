@org.junit.Test
public void testImportmRnaData1BulkLoadOff() throws java.lang.Exception {
    org.mskcc.cbio.portal.scripts.MySQLbulkLoader.bulkLoadOff();
    runImportRnaData1();
    org.mskcc.cbio.portal.scripts.MySQLbulkLoader.bulkLoadOn();
}