public int getClusterSize() {
    if ((this.cluster) != null) {
        domainregistry.Metadata metadata = this.cluster.getMetadata();
        return metadata.getAllHosts().size();
    }else
        return 0;
    
}