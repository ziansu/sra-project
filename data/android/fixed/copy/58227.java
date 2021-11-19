private void saveWorkingDirectories(java.lang.String repositoryId) {
    org.repositoryminer.mining.local.WorkingDirectoryProcessor wdProcessor = new org.repositoryminer.mining.local.WorkingDirectoryProcessor();
    wdProcessor.setReferences(selectedReferences);
    wdProcessor.setRepositoryId(repositoryId);
    wdProcessor.setListener(listener);
    wdProcessor.processWorkingDirectories();
}