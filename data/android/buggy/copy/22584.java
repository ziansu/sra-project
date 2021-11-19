@java.lang.Override
public org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO getMetadataRepository(java.net.URI location, int flags) {
    org.eclipse.ecf.mgmt.p2.repository.RepositoryMTO[] repos = getMetadataRepositories(location, flags);
    return (repos.length) == 0 ? null : repos[0];
}