@java.lang.Override
public void persist() {
    if (analysisMode.isPreview()) {
        org.sonar.batch.issue.IssuePersister.LOG.debug("IssuePersister skipped in preview mode");
        return ;
    }
    java.lang.Iterable<org.sonar.api.issue.internal.DefaultIssue> issues = issueCache.all();
}