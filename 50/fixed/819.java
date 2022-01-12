private java.lang.String getWildcardMatch(java.lang.String id, java.util.List<java.lang.String> wildcards) {
    if (id != null) {
        for (java.lang.String wildcard : wildcards) {
            if (id.matches(wildcard)) {
                return wildcard;
            }
        }
    }
    return null;
}