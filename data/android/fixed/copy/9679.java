@org.junit.Test
public void testInsideAreaDown() {
    area.setDirection(Angle.DOWN);
    area.setRange(5);
    model.area.TileCoordinate loc = new model.area.TileCoordinate(10, 11);
    org.junit.Assert.assertTrue(area.isInRange(loc));
}