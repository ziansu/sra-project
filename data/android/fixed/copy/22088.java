@org.junit.Test
public void testInsideAreaUpFalse() {
    model.area.TileCoordinate loc = new model.area.TileCoordinate(10, 11);
    org.junit.Assert.assertFalse(area.isInRange(loc));
}