@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    jedis.hset(id.getBytes(), key.toString().getBytes(), org.mybatis.caches.redis.SerializeUtil.serialize(value));
    return null;
}