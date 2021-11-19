public void execute(org.shipkit.gradle.ReleaseNeededTask t) {
    t.setBranch(branch);
    t.setCommitMessage(java.lang.System.getenv("TRAVIS_COMMIT_MESSAGE"));
    t.setPullRequest(isPullRequest);
}