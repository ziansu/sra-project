@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void initYCoordinate_Nan() throws java.lang.Exception {
    new asteroids.model.Vector(0, java.lang.Double.NaN);
}