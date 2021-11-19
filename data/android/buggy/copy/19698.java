@java.lang.Override
public void setConnectionManager(org.shirdrn.storm.api.ConnectionManager<redis.clients.jedis.Jedis> connectionManager) {
    this.connectionManager = connectionManager;
    this.connection = this.connectionManager.getConnection();
}