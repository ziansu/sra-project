private void stopTicker() {
    if (receiverRegistered) {
        unregisterReceiver(receiver);
        ticker.cancel(true);
        receiverRegistered = false;
    }
}