private java.lang.String getRootIssueType() {
    return environmentVariables.getProperty(JIRARequirementsConfiguration.JIRA_ROOT_ISSUE_TYPE, "epic");
}