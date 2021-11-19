@java.lang.Override
public void reconnectBlocking() {
    reconnectBlocking(requestGatewayBlocking(), null, (-1), (-1));
}