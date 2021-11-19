@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    return jedis.hdel(id.toString(), key.toString());
}