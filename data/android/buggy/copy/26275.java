public void subscribe(redis.clients.jedis.BinaryJedisPubSub jedisPubSub, byte[]... channels) {
    client.setTimeoutInfinite();
    jedisPubSub.proceed(client, channels);
    client.rollbackTimeout();
}