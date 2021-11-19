@java.lang.Override
protected io.netty.handler.codec.redis.FullBulkStringRedisMessage beginAggregation(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage start, io.netty.buffer.ByteBuf content) throws java.lang.Exception {
    return new io.netty.handler.codec.redis.FullBulkStringRedisMessage(content);
}