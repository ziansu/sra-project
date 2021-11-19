protected void initializeRTOEstimators(long measuredRTT, int estimatorType, org.eclipse.californium.core.network.RemoteEndpoint endpoint) {
    long newRTO = config.getInt(NetworkConfigDefaults.ACK_TIMEOUT);
    endpoint.updateRTO(newRTO);
}