@org.junit.Test
public void testGetLoc() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    java.awt.Point q1 = new java.awt.Point(1, 1);
    assertEquals(t1.getLoc(), q1);
}