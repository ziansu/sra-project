@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if (future.isSuccess()) {
        ctx.channel().read();
    }else {
        future.channel().close();
    }
}