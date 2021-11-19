private void clearClusters() {
    for (java.lang.Object cluster : clusters) {
        ((Cluster) (cluster)).clear();
    }
}