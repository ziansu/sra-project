private boolean isHashingDisabled(java.lang.String type) {
    if (!(enableHashing)) {
        return false;
    }
    try (redis.clients.jedis.Jedis jedis = source.getJedis()) {
        return jedis.exists(hashesDisabled(type));
    }
}