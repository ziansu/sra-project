public void psubscribe(final redis.clients.jedis.JedisPubSub jedisPubSub, final java.lang.String... patterns) {
    checkIsInMulti();
    connect();
    client.setTimeoutInfinite();
    jedisPubSub.proceedWithPatterns(client, patterns);
    client.rollbackTimeout();
}