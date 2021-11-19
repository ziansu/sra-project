private boolean isAuthorityTermDocument(java.lang.String termRefName) {
    boolean result = true;
    try {
        org.collectionspace.services.common.api.RefName.AuthorityItem item = RefName.AuthorityItem.parse(termRefName);
    } catch (java.lang.IllegalArgumentException e) {
        result = false;
    }
    return result;
}