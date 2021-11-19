@java.lang.Override
public int getUsersPerSiteTotal(java.lang.String site) throws org.craftercms.studio.api.v1.exception.SiteNotFoundException {
    org.craftercms.studio.api.v1.service.security.SecurityProvider provider = lookupProvider(getProviderType());
    return provider.getUsersPerSiteTotal(site);
}