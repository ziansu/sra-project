@org.junit.Test
public void longIntegersDivided() {
    long a = 12752242835177213L;
    long b = 1062912L;
    org.junit.Assert.assertEquals(11997458712L, (a / b));
    org.junit.Assert.assertEquals((-11997458712L), (a / (-b)));
}