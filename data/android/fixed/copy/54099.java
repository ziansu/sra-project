public boolean pushToRemote(boolean force, com.liferay.jenkins.results.parser.GitWorkingDirectory.Remote remote) {
    com.liferay.jenkins.results.parser.GitWorkingDirectory.Branch currentBranch = getCurrentBranch();
    return pushToRemote(force, currentBranch, currentBranch.getName(), remote);
}