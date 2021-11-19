@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    ng.abdlquadri.eventbus.EventBus.globalConnectHandler.onDisConnect(new java.lang.IllegalStateException("You are disconnected from the EventBus"));
}