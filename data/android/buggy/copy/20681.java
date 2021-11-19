@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void initXCoordinate_Nan() throws java.lang.Exception {
    new asteroids.model.Vector(java.lang.Double.NaN, 0);
}