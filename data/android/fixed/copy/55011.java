org.apache.cassandra.gossip.hyparview.NeighborRequestMessage.Priority determineNeighborPriority(java.lang.String datacenter) {
    return (datacenter.equals(this.datacenter)) && (localDatacenterView.isEmpty()) ? org.apache.cassandra.gossip.hyparview.NeighborRequestMessage.Priority.HIGH : org.apache.cassandra.gossip.hyparview.NeighborRequestMessage.Priority.LOW;
}