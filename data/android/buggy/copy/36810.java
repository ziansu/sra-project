@org.junit.Test
public void validateFormatIsoDateStringWithMillis() {
    java.lang.String isoDateStringWithMillis = "2016-08-01T03:48:23.000Z";
    org.junit.Assert.assertTrue(fact.isIsoDateStringValidFormat(isoDateStringWithMillis));
}