@org.junit.Test
public void testGetLevel() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    assertEquals(t1.getLevel(), 0);
}