@java.lang.Override
public void prepare(java.util.Map map, backtype.storm.task.TopologyContext topologyContext, backtype.storm.task.OutputCollector outputCollector) {
    this.collector = outputCollector;
    this.distributionAggregator = new com.orhundalabasmaz.storm.loadbalancer.aggregator.DistributionAggregator();
    this.keyWorkers = new java.util.HashMap<>();
}