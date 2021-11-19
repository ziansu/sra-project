@java.lang.Override
public void onPayload(final io.grpc.testing.integration.Messages.StreamingOutputCallResponse payload) {
    queue.add(payload);
}