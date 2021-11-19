private void commonPrecheck(java.lang.String excludedSiteId) {
    java.util.List<java.lang.String> excludedSiteIds = new java.util.ArrayList<>();
    if (excludedSiteId != null) {
        excludedSiteIds.add(excludedSiteId);
    }
    commonPrecheck(excludedSiteIds);
}