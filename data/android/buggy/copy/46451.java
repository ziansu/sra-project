@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    if (trace) {
        log.trace("Deferred handler got channel inactive event [address={}]", id);
    }
    super.channelInactive(ctx);
    discardDeferred(ctx);
}