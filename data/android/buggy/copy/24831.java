@org.junit.Test
public void testPayFineFail() {
    java.lang.System.out.println(server.logic.tables.FeeTable.getInstance().getFeeTable());
    assertNotEquals("fail", server.logic.tables.FeeTable.getInstance().payfine(6));
}