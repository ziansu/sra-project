public int getClusterSize() {
    domainregistry.Metadata metadata = this.cluster.getMetadata();
    return metadata.getAllHosts().size();
}