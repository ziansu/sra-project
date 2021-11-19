private java.lang.String getDeployerPreviewSyncUrl(java.lang.String site) {
    java.lang.String toRet = studioConfiguration.getProperty(org.craftercms.studio.impl.v1.deployment.PREVIEW_DEFAULT_PREVIEW_DEPLOYER_URL).replace(StudioConstants.CONFIG_SITENAME_VARIABLE, site);
    return toRet;
}