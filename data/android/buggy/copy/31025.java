@org.junit.Test
public void testIsValidIPV4WhenNull() throws java.lang.Exception {
    org.apache.pig.data.Tuple tuple = org.apache.pig.test.Util.buildTuple();
    org.junit.Assert.assertFalse("null object return false", new com.github.christiangda.pig.ip.IsValidIPV4().exec(tuple));
}