@java.lang.Override
public void mv(org.apache.axis.types.URI fromSurl, org.apache.axis.types.URI toSurl) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmMvResponse response = srm.srmMv(new org.dcache.srm.v2_2.SrmMvRequest(null, fromSurl, toSurl, null));
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus());
}