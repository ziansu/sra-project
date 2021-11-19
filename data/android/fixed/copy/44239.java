public void next() {
    structReadBuffer.skipAll();
    if (arrayReadBuffer.limitReached()) {
        return ;
    }
    int structSize = arrayReadBuffer.getVlqInt();
    structReadBuffer = arrayReadBuffer.limit(structSize);
    metadata.reset();
}