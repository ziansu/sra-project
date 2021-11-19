@org.junit.Test
public void testToString() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    assertEquals(t1.toString(), ("(1,1) " + (t1.getColor())));
}