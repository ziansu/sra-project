@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void messageShouldRequireNonEmptyKey() {
    org.openlmis.referencedata.util.Message msg = new org.openlmis.referencedata.util.Message(" ");
}