public void receive() {
    buffer = acquireBuffer();
    process(buffer);
}