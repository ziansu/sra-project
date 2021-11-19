@org.junit.Test(expected = java.lang.NullPointerException.class)
public void messageShouldRequireNonNullKey() {
    org.openlmis.referencedata.util.Message msg = new org.openlmis.referencedata.util.Message(null);
}