@org.junit.Test
public void testLookLimitPass() {
    assertEquals(true, server.logic.tables.LoanTable.getInstance().looklimit(0));
}