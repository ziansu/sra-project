public void next() {
    if (arrayReadBuffer.limitReached()) {
        return ;
    }
    structReadBuffer.skipAll();
    int structSize = arrayReadBuffer.getVlqInt();
    structReadBuffer = arrayReadBuffer.limit(structSize);
    metadata.reset();
}