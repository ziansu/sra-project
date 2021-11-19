@java.lang.Override
public void mkdir(org.apache.axis.types.URI surl) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmMkdirResponse response = srm.srmMkdir(new org.dcache.srm.v2_2.SrmMkdirRequest(null, surl, null));
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus(), TStatusCode.SRM_SUCCESS);
}