public synchronized void addCluster(long cluster) {
    android.util.Log.i("CACHE", ("Cluster: " + (java.lang.String.valueOf(cluster))));
    clusterList.add(cluster);
}