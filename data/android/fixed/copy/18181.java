public org.elasticsearch.index.query.QueryBuilder getAclFilterForPermissions(java.util.List<java.lang.String> permissions, boolean noPublic) {
    return getAclFilterForPermissions(permissions, "acl", noPublic);
}