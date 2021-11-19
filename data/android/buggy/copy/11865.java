public java.util.Map<java.lang.String, org.apache.commons.pool.impl.GenericObjectPool> getTargetChannelPool() {
    if ((poolManagementPolicy) == (org.wso2.carbon.transport.http.netty.sender.channel.pool.ConnectionManager.PoolManagementPolicy.GLOBAL_ENDPOINT_CONNECTION_CACHING)) {
        int ind = (index.getAndIncrement()) % (poolCount);
        return poolList.get(ind);
    }
    return null;
}