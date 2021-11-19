public void subscribe(final redis.clients.jedis.JedisPubSub jedisPubSub, final java.lang.String... channels) {
    client.setTimeoutInfinite();
    try {
        jedisPubSub.proceed(client, channels);
    } finally {
        client.rollbackTimeout();
    }
}