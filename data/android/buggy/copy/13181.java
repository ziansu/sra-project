@org.junit.Test
public void testGetItemTablePass() {
    server.logic.tables.TitleTable.getInstance().createtitle("9781442", "test");
    server.logic.tables.ItemTable.getInstance().createitem("9781442");
    assertEquals(5, server.logic.tables.ItemTable.getInstance().getItemTable().size());
}