@org.apache.hadoop.classification.InterfaceAudience.Private
public void rampDownReduces(int rampDown) {
    for (int i = 0; i < rampDown; i++) {
        org.apache.hadoop.mapreduce.v2.app.rm.ContainerRequest request = scheduledRequests.removeReduce();
        pendingReduces.add(request);
    }
}