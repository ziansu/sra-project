protected boolean rebuildMetadata(java.lang.String site) {
    siteService.syncDatabaseWithRepo(site, null);
    return true;
}