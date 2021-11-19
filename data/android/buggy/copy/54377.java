@org.junit.Test
public void test_create_from_Date() throws java.lang.Exception {
    org.junit.Assert.assertEquals(20140912, dint.Dint.create(new java.util.Date((2014 - 1900), 8, 12)));
}