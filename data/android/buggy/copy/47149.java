public void writeMemory(int address, java.lang.String data, boolean enable) {
    if (!enable) {
        return ;
    }
    int index = binaryToDecimal(address);
    dataMemory.set(index, data);
}