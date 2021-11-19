@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void validatingOrgMRN2() {
    java.lang.String orgMrn = "urn:x-mrn:mcl:org:dma";
    boolean ret = net.maritimecloud.identityregistry.utils.MrnUtils.validateMrn(orgMrn);
}