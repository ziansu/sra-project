public void setbit(final java.lang.String key, final long offset, final boolean value) {
    setbit(redis.clients.util.SafeEncoder.encode(key), offset, redis.clients.jedis.Protocol.toByteArray((value ? 1 : 0)));
}