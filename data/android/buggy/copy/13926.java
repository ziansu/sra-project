private void loadNewIssue() {
    setAllButtonEnable(false);
    this.lastIssueCount = this.issueLoader.getIssues().size();
    this.issueLoader.loadNewIssues();
}