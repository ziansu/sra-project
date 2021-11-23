public void setClusterSize(int newSize) throws java.lang.InterruptedException {
    setClusterSize(getSingleCluster().getName(), newSize);
}