@java.lang.Override
public long refill(long limit, long available) {
    final long now = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
    if (now < (nextRefillTime)) {
        return 0;
    }
    nextRefillTime = now + (super.getTimeUnitInMillis());
    return limit;
}