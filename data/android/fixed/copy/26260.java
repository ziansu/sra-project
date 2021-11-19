private void deleteGitRepository(org.aludratest.service.gitclient.GitClient git) {
    if (git != null) {
        org.databene.commons.FileUtil.deleteDirectory(new java.io.File(git.getWorkingDirectory().getValue()));
    }
}