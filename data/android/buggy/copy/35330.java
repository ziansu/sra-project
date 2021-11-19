@org.junit.Test
public void testCheckLoanDblStringPass() {
    java.lang.System.out.println(server.logic.tables.LoanTable.getInstance().getLoanTable());
    assertEquals(false, server.logic.tables.LoanTable.getInstance().checkLoan("9781442668584", "1"));
}