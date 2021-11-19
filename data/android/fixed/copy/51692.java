@java.lang.Override
public void channelInactive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    com.hotels.netty.balancer.LoadBalancerEntryHandler.closeOnFlush(inboundChannel);
}