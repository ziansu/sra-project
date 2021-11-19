@java.lang.Override
public void run() {
    ctx.pipeline().writeAndFlush(new net.md_5.bungee.protocol.packet.StatusResponse(buildResponseJSON()));
}