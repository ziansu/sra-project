@org.junit.Test
public void testInsideAreaUpTrue() {
    model.area.TileCoordinate loc = new model.area.TileCoordinate(10, 9);
    org.junit.Assert.assertTrue(area.isInRange(loc));
}