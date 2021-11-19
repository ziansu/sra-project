@org.junit.Test
public void testValidateFormatWhenSalesSpecificIDAndResultIsOK() {
    boolean b = fact.validateFormat("BEL-SN-2017-123456", ".*-.*-[A-Za-z0-9\\-]{1,20}");
    org.junit.Assert.assertTrue(b);
}