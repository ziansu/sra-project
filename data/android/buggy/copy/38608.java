@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    log.log(java.util.logging.Level.SEVERE, "CHANNEL NOT ACTIVE");
    ng.abdlquadri.eventbus.EventBus.globalConnectHandler.onDisConnect(new java.lang.IllegalStateException("You are disconnected from the EventBus"));
}