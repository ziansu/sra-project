@java.lang.Override
public java.lang.String execute(redis.clients.jedis.Jedis connection) {
    return connection.mset(keysvalues);
}