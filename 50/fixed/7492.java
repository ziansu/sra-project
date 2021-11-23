protected void initiateSendIfNecessary() {
    if (!(isSending.getAndSet(true))) {
        sendBytesFromBuffer();
    }
}