@org.junit.Test
public void testPayFineFail() {
    assertNotEquals("fail", server.logic.tables.FeeTable.getInstance().payfine(6));
}