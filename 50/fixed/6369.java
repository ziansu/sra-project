@java.lang.Override
public void handleProtocolNegotiationCompleted(io.grpc.Attributes attrs) {
    attributes = transportListener.transportReady(attrs);
}