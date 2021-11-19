@java.lang.Override
public void channelReadComplete(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    discardSomeReadBytes();
    flushIfNeeded(ctx);
    readIfNeeded(ctx);
    if (firedChannelRead) {
        firedChannelRead = false;
        ctx.fireChannelReadComplete();
    }
}