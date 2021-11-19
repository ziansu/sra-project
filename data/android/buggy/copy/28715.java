@java.lang.Override
public io.grpc.netty.Handler newHandler(io.grpc.netty.GrpcHttp2ConnectionHandler handler) {
    io.netty.handler.codec.http2.Http2ClientUpgradeCodec upgradeCodec = new io.netty.handler.codec.http2.Http2ClientUpgradeCodec(handler);
    io.netty.handler.codec.http.HttpClientCodec httpClientCodec = new io.netty.handler.codec.http.HttpClientCodec();
    final io.netty.handler.codec.http.HttpClientUpgradeHandler upgrader = new io.netty.handler.codec.http.HttpClientUpgradeHandler(httpClientCodec, upgradeCodec, 1000);
    return new io.grpc.netty.ProtocolNegotiators.BufferingHttp2UpgradeHandler(upgrader);
}