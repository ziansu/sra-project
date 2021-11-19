@java.lang.Override
public void rstStream(int streamId, com.squareup.okhttp.internal.spdy.ErrorCode errorCode) {
    if (finishStream(streamId, io.grpc.transport.okhttp.OkHttpClientTransport.toGrpcStatus(errorCode))) {
        stopIfNecessary();
    }
}