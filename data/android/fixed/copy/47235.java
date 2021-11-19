public static Cluster min(Cluster cluster, Cluster otherCluster) {
    return (cluster.getId()) < (otherCluster.getId()) ? cluster : otherCluster;
}