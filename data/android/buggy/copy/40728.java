private void purgeBuffer() {
    currBuffer.merge(prevBuffer);
    updater.updateAsync(java.util.Collections.unmodifiableMap(currBuffer));
    prevBuffer = currBuffer;
    currBuffer = new kk.aggregator.lowprice.LowPriceBuffer(bufferCapacity);
}