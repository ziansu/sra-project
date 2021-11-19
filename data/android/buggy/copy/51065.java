public org.kohsuke.github.GHCommit.ShortInfo getCommitShortInfo() throws java.io.IOException {
    populate();
    return commit;
}