@java.lang.Override
public final boolean isValidVersion(final java.lang.String version) {
    if ((null == version) || (version.isEmpty())) {
        return false;
    }
    return this.database.verifyCommitExists(version);
}