@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if ((name) == null) {
        sink.register(future.channel());
    }else {
        sink.register(name, future.channel());
    }
}