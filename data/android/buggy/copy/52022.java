@org.junit.Test
public void testnormalizeException() {
    com.github.fishio.Vec2d vec1 = new com.github.fishio.Vec2d();
    try {
        vec1.normalize();
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
    }
}