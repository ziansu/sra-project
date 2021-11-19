public redis.clients.jedis.Pipeline pipelined() {
    redis.clients.jedis.Pipeline pipeline = new redis.clients.jedis.Pipeline();
    pipeline.setClient(client);
    return pipeline;
}