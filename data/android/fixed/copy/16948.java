@org.junit.Test
public void negatives() throws java.lang.Exception {
    junit.framework.TestCase.assertEquals(4, gcd((-24), 28));
    junit.framework.TestCase.assertEquals(4, gcd(24, (-28)));
}