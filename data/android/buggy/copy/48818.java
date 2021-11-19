private static java.util.List<java.lang.String> sanitizeScmAccounts(java.util.List<java.lang.String> scmAccounts) {
    scmAccounts.removeAll(java.util.Arrays.asList(null, ""));
    return scmAccounts;
}