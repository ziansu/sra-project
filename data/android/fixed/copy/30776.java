public void CloseAllConnections() throws org.openrdf.repository.RepositoryException {
    src.close();
    sr.shutDown();
}