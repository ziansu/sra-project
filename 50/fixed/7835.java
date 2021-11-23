private boolean isFinished(int currentState) {
    return currentState == (com.navercorp.pinpoint.rpc.client.PinpointClientHandshaker.STATE_FINISHED);
}