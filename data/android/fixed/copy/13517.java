protected org.intermine.api.query.PathQueryExecutor getPathQueryExecutor() {
    final org.intermine.api.profile.Profile profile = getPermission().getProfile();
    return im.getPathQueryExecutor(profile);
}