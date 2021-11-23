public void psubscribe(final redis.clients.jedis.JedisPubSub jedisPubSub, final java.lang.String... patterns) {
    checkIsInMulti();
    client.setTimeoutInfinite();
    try {
        jedisPubSub.proceedWithPatterns(client, patterns);
    } finally {
        client.rollbackTimeout();
    }
}