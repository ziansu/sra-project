@javax.annotation.Nonnull
static argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction toCommit(org.gitlab.api.models.GitlabProject project, java.lang.String hash) {
    return argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction.create(argelbargel.jenkins.plugins.gitlab_branch_source.Messages.GitLabLink_DisplayName_Commit(), argelbargel.jenkins.plugins.gitlab_branch_source.GitLabSCMIcons.ICON_COMMIT, project, ("commits/" + hash));
}