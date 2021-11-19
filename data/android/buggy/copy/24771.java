@org.junit.Test
public void testGetNorthAfterTwoRotation() {
    tile2.rotateTile();
    GlobalVariables.Feature n = GlobalVariables.Feature.ROAD;
    org.junit.Assert.assertEquals(n, tile2.getTargetFeature(GlobalVariables.Direction.NORTH));
}