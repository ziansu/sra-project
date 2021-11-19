public org.jbpm.designer.repository.Repository unregisterRepository(java.lang.String repositoryId) {
    org.jbpm.designer.repository.Repository repository = this.availableRepositories.get(repositoryId);
    this.availableRepositories.remove(repository);
    return repository;
}