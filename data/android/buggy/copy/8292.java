public java.lang.String getLatestICGCGetVersionUrl(java.lang.String os) {
    java.util.List<org.icgc.dcc.portal.server.service.SoftwareService.ArtifactFolder> Versions = getVersions("icgc-get");
    return getICGCGetVersionUrl("0.2.10", os);
}