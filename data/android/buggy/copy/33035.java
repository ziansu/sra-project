@java.lang.Override
public boolean doesProjectExist(java.lang.String projectKey) {
    com.google.common.base.Preconditions.checkNotNull(projectKey, "projectKey is null");
    try {
        return execute(("project = " + projectKey), com.isroot.stash.plugin.jira.JiraServiceImpl.SUCCESS_ON.STATUS_200);
    } catch (com.isroot.stash.plugin.jira.JiraLookupsException e) {
        return true;
    }
}