private static void sendHttpResponse(co.paralleluniverse.comsat.webactors.netty.ChannelHandlerContext ctx, co.paralleluniverse.comsat.webactors.netty.FullHttpRequest req, co.paralleluniverse.comsat.webactors.netty.FullHttpResponse res, java.lang.Boolean close) {
    co.paralleluniverse.comsat.webactors.netty.WebActorHandler.writeHttpResponse(ctx, req, res, close);
}