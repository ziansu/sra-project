@java.lang.Override
public void releaseSpace(java.lang.String spaceToken) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmReleaseSpaceResponse response = srm.srmReleaseSpace(new org.dcache.srm.v2_2.SrmReleaseSpaceRequest(null, spaceToken, null, null));
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus(), TStatusCode.SRM_SUCCESS);
}