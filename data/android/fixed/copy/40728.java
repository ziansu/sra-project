private void purgeBuffer() {
    updater.updateAsync(java.util.Collections.unmodifiableMap(prevBuffer), java.util.Collections.unmodifiableMap(currBuffer));
    prevBuffer = currBuffer;
    currBuffer = new kk.aggregator.lowprice.LowPriceBuffer(bufferCapacity);
}