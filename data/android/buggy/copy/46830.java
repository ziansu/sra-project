@java.lang.Override
public void finalize() {
    try {
        shutdown();
    } catch (java.lang.InterruptedException e) {
        org.hyperledger.fabric.sdk.OrdererClient.logger.debug("Failed to shutdown the OrdererClient");
    }
}