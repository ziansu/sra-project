@org.junit.Test
public void testEllipsoidVolume() {
    org.junit.Assert.assertEquals(251.32, org.cp.elements.lang.MathUtils.ellipsoidVolume(5.0, 4.0, 3.0), 0.008);
}