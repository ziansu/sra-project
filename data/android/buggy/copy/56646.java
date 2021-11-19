public void setQueueWeight(java.lang.String queue, org.apache.hadoop.yarn.server.resourcemanager.resource.ResourceWeights weight) {
    synchronized(queueWeights) {
        queueWeights.put(queue, weight);
    }
}