private long averageGap() {
    return (org.apache.cassandra.net.OutboundTcpConnection.TimeHorizonMovingAverageCoalescingStrategy.MEASURED_INTERVAL) / (sum);
}