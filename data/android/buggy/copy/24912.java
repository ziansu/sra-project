@org.jboss.seam.annotations.security.Restrict(value = "#{s:hasPermission('trust', 'access')}")
public java.lang.String uploadFile() {
    log.info("uploadFile() Requestor", spRequestor);
    synchronized(svnSyncTimer) {
    }
    return org.gluu.oxtrust.util.OxTrustConstants.RESULT_SUCCESS;
}