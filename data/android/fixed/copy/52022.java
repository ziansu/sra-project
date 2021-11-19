@org.junit.Test(expected = java.lang.ArithmeticException.class)
public void testnormalizeException() {
    com.github.fishio.Vec2d vec1 = new com.github.fishio.Vec2d();
    if ((vec1.normalize()) == (new com.github.fishio.Vec2d())) {
        org.junit.Assert.fail();
    }
}