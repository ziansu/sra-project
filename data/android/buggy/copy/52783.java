public void onMemoryWrite(int address, byte[] data) {
    if (enabled)
        actions.addMemoryWrite(address, data);
    
}