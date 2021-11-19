@java.lang.Override
public void received(java.lang.Object received) {
    com.tri.pgs.client.network.udp.UDPClient.logger.log(java.util.logging.Level.INFO, ("UDPClient received object: " + (received.toString())));
}