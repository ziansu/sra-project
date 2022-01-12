@org.junit.Test
public void testDeleteItemSuccessFail() {
    assertNotEquals("success", server.logic.tables.ItemTable.getInstance().delete("7894563214563", "0"));
}