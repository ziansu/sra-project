@org.junit.Test
public void calculateAgeShouldReturn_NineteenYears() {
    java.lang.String age = org.openmrs.mobile.utilities.DateUtils.calculateAge("1997-10-15");
    org.junit.Assert.assertEquals("19", java.lang.String.valueOf(age));
}