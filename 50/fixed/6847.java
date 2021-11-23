@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if ((future.cause()) != null) {
        future.channel().close();
        promise.tryFailure(future.cause());
    }
}