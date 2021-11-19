@org.junit.Test
public void test() {
    java.lang.System.out.println("******");
    java.math.BigInteger calculatedResult = new net.eulerproject.problemNo421.PrimeNumberOfnTo15plus1(ms, ns).calculateSum();
    org.junit.Assert.assertEquals(result, calculatedResult);
}