@java.lang.Override
public java.lang.Object doWithRedis(redis.clients.jedis.Jedis jedis) {
    return org.mybatis.caches.redis.SerializeUtil.unserialize(jedis.hget(id.getBytes(), key.toString().getBytes()));
}