public java.lang.String getRemoteUrl(org.alien4cloud.tosca.model.Csar csar, java.lang.String remoteName) {
    java.nio.file.Path archiveGitPath = csarRepositry.getExpandedCSAR(csar.getWorkspace(), csar.getName(), csar.getVersion());
    return alien4cloud.git.RepositoryManager.getRemoteUrl(archiveGitPath, remoteName);
}