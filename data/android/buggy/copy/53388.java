@org.junit.Test
public void testgetXandY() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    org.junit.Assert.assertEquals(t1.getX(), 1);
    org.junit.Assert.assertEquals(t1.getY(), 1);
}