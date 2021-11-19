public void connectToDevice() {
    shareSessionKey();
    initTimestamp();
    shareIV();
    authenticate();
}