@org.junit.Test
public void testIsValidIPV4WhenInvalidIPV4() throws java.lang.Exception {
    org.apache.pig.data.Tuple tuple = org.apache.pig.test.Util.buildTuple("192.168.1.");
    org.junit.Assert.assertFalse("invalid IPV4 string return false", new com.github.christiangda.pig.ip.IsValidIPV4().exec(tuple));
}