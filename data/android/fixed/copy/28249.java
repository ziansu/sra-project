@java.lang.Override
public org.apache.commons.pool2.PooledObject<org.apache.hadoop.hbase.client.Connection> makeObject() throws java.lang.Exception {
    org.apache.hadoop.hbase.client.Connection connection = this.createConnection();
    return new org.apache.commons.pool2.impl.DefaultPooledObject<org.apache.hadoop.hbase.client.Connection>(connection);
}