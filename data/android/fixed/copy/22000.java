public void receive() {
    if ((buffer) == null)
        acquireBuffer();
    
    process();
}