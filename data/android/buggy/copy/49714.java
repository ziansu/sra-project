@javax.annotation.Nonnull
@java.lang.Override
public org.dcache.srm.v2_2.TMetaDataSpace getSpaceMetaData(java.lang.String spaceToken) throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.TMetaDataSpace space = getSpaceMetaData(new java.lang.String[]{ spaceToken })[0];
    org.dcache.srm.shell.TStatusCodes.checkSuccess(space.getStatus(), TStatusCode.SRM_SUCCESS);
    return space;
}