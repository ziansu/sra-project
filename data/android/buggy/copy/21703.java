@java.lang.Override
protected io.netty.channel.ChannelOutboundBuffer.ThreadLocalPooledByteBuf newObject(io.netty.util.Recycler.Handle<io.netty.channel.ChannelOutboundBuffer.ThreadLocalPooledByteBuf> handle) {
    return new io.netty.channel.ChannelOutboundBuffer.ThreadLocalPooledByteBuf(handle);
}