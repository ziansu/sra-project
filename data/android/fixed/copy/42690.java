@java.lang.Override
public void close(io.netty.channel.ChannelHandlerContext ctx, io.netty.channel.ChannelPromise future) throws java.lang.Exception {
    super.close(ctx, future);
    discardDeferred(ctx);
}