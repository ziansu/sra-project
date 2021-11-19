private java.lang.String getIndexName(final org.scenarioo.rest.base.BuildIdentifier buildIdentifier) {
    return (((getContextPrefix()) + (buildIdentifier.getBranchName())) + "-") + (buildIdentifier.getBuildName());
}